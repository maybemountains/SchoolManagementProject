package launcher;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import datamodel.Admin;
import datamodel.Courses;
import datamodel.Enrollment;
import datamodel.Students;
import service.StudentService;

public class Launcher {
	public static void main(String[] a) throws ParseException, IOException {
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Admin admin = new Admin();
//		admin.setAdminID(202301);
//		admin.setUsername("adminGay");
//		admin.setPassword("Hatsune Miku says Trans Rights");
//		
//		Courses course = new Courses();
//		course.setCourseDuration(20);
//		course.setCourseID(2);
//		course.setCourseName("How to be gay");
//		
//		Enrollment enrollment = new Enrollment();
//		enrollment.setEnrollmentID(22);
//		enrollment.setDetails("Fall 2023 enrollment!");
//		enrollment.setEnrollmentDate(sdf.parse("01/01/2023"));
//		
//		Students student = new Students();
//		student.setAge("18");
//		student.setName("Wally");
//		student.setDepartment("Bachelors of Computer Science");
//		student.setStudId("12345");
//		student.setYear("2023");
//		
//		
//		List<String> courses = new ArrayList<String>();
//		courses.add("Java");
//		courses.add("Python");
//		courses.add("C++");
//		
//		student.setCourse(courses);
//		courses.forEach(c -> System.out.println(c));
		
		 StudentService test = new StudentService();
//		 System.out.print(test.read());
		 test.sortStudents(test.read());
		
		
	}
}
