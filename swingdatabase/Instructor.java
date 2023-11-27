package swingdatabase;

// she'll post hers on her git and then u can check it and fix it to make sure it works with urs

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Instructor {

	public static void main(String[] args) {
		JFrame f = new JFrame("Instructor Form");
		JLabel instructorId, name, email, phoneNumber, targetYear;
		final JTextField idField = new JTextField();
		final JTextField nameField = new JTextField();
		final JTextField numberField = new JTextField();
		final JTextField emailField = new JTextField();

		JCheckBox targetYearField1 = new JCheckBox("Fall 2023");
		JCheckBox targetYearField2 = new JCheckBox("Fall 2022");

		instructorId = new JLabel("Instructor ID: ");
		instructorId.setBounds(50, 50, 100, 30);
		idField.setBounds(140, 50, 100, 30);

		name = new JLabel("Name: ");
		name.setBounds(50, 100, 100, 30);
		nameField.setBounds(140, 100, 100, 30);

		email = new JLabel("Email: ");
		email.setBounds(50, 150, 100, 30);
		emailField.setBounds(140, 50, 100, 30);

		phoneNumber = new JLabel("Phone Number: ");
		phoneNumber.setBounds(50, 150, 100, 30);
		numberField.setBounds(140, 50, 100, 30);

		targetYear = new JLabel("Target Year: ");
		targetYear.setBounds(50, 200, 100, 30);
		targetYearField1.setBounds(140, 150, 100, 30);
		targetYearField2.setBounds(140, 180, 100, 30);

		JButton b = new JButton("Register");
		b.setBounds(100, 500, 100, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String instructorId = idField.getText();
				String name = nameField.getText();
				String email = emailField.getText();
				String phoneNumber = numberField.getText();
				String targetYear = ((targetYearField1.isSelected() && !targetYearField2.isSelected() ? "Fall 2023"
						: "Fall 2022"));
				addInstructor(instructorId, name, email, phoneNumber, targetYear);
				JOptionPane.showMessageDialog(b, "Registered");

			}
		});

	}

	public static void addInstructor(String instructorId, String name, String email, String phoneNumber,
			String targetYear) {
		try {
			String url = "jdbc:mysql://localhost:3306/schoolManagement";
			String user = "root";
			String password = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected DB");

			// Prepare the sql query to do
			PreparedStatement prep = connection
					.prepareStatement("insert into instructor(instructorId, name, email, phoneNumber, targetYear)"
							+ "values(?,?,?,?,?)");
			prep.setString(1, instructorId);
			prep.setString(2, name);
			prep.setString(3, email);
			prep.setString(4, phoneNumber);
			prep.setString(5, targetYear);
			prep.executeUpdate();
			System.out.println("Inserted successfully");

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
	}

}
