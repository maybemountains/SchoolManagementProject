package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import datamodel.Students;

public class StudentService {

	public List<Students> read() throws IOException {
		String line = null;
		String splitBy = ",";
		String path = "/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/schoolManagement/src/students.csv";
		BufferedReader br = new BufferedReader(new FileReader(path));
		List<Students> studentList = new ArrayList<>();
		int count = 0;
		while ((line = br.readLine()) != null) {
			// skip the first line (in this case this labels what each "column" is)
			if (count != 0) {
				String[] students = line.split(splitBy);

				Students student = new Students();
				String a = students[4].trim();
				if (a != "") { // if the age exists
					// are they 19 or older? yea? cool have an age. nah? lol sorry you're 0 years old now. 
					a = (Integer.valueOf(students[4].trim()) >= 19) ? students[4].trim() : String.valueOf(0);
				}
				student.setStudId(students[0].trim());
				student.setName(students[1].trim());
				student.setDepartment(students[2].trim());

				String courses = students[3].trim(); // courses is one string separated by ;
				String[] values = courses.split(";"); // make a list of everything by separating it by ;
				student.setCourse(Arrays.asList(values));
				student.setAge(students[4].trim());
				student.setYear(students[5].trim());
				double fee = Double.parseDouble(students[6].trim());
				student.setFee(fee);
				student.setPaid(students[7].trim());
				// if the final value is not null or empty
				if (students[7].trim() != null && !students[7].trim().isEmpty()) {
					student.setPaid(students[7].trim()); // set the value
				}
				studentList.add(student); // add the student to the student list
			}
			count++; // up the count (this makes sure that we don't read the first line, as we will never hit this after)
		}
		br.close();
		return studentList; // return our final list of students
	}
	
	// write a function that will sort the output according to the age/year and display it in the console
    public void sortStudents(List<Students> students) {
    	
        // Define a custom comparator to sort students by age
        Comparator<Students> ageYearComparator = Comparator.comparing(Students::getAge);

        // Sort the list using the comparator
        Collections.sort(students, ageYearComparator);
        
        // display the list
        for (Students student : students) {
        	System.out.println(student);
        }
    }
}