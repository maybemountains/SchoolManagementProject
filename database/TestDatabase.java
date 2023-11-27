// I was absent this day, I've taken the file from a classmate so that I can catch up

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDatabase {

    public static void main(String[] args) {
        try {
            String sql = "jdbc:mysql://localhost:3306/javaDB";
            String username = "root";
            String password = "";
            
            // creates the connection
            Connection con = DriverManager.getConnection(sql, username, password);
            
            PreparedStatement prep, prep1, prep2;
            
            prep = con.prepareStatement("insert into sample(id, name) values (?,?)");
            prep.setString(1, "100");
            prep.setString(2, "abcd");
            
//            prep1 = con.prepareStatement("alter table sample add age INT");
            
            prep.executeUpdate();
//            prep1.executeUpdate();
            
            prep2 = con.prepareStatement("select * from sample");
            
            ResultSet rs = prep2.executeQuery();
            
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.printf("%s %s %s%n", id, name, age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}