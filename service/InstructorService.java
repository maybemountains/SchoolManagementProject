package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import datamodel.Instructors;

public class InstructorService {

	public List<Instructors> readCSV() throws IOException {
		
		String line = null;
		String splitBy = ",";
		int count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/schoolManagement/src/instructors.csv"));
		
		List<Instructors> instructorList = new ArrayList<>();
		
		while ((line = br.readLine()) != null) {
			if (count != 0) {
				Instructors instructor = new Instructors();
				String[] instructors = line.split(splitBy);
				String sub = instructors[2].trim();
				
				instructor.setInstructorID(instructors[0].trim());
				instructor.setName(instructors[1].trim());
				instructor.setSubject(sub);
				if (sub.equals("C++")) {
					instructor.setSubject("JavaScript");
				}
				
				instructor.setPhoneNumber(new BigInteger(instructors[3].trim()));
				instructor.setEmail(instructors[4].trim());
				instructor.setTargetYear(instructors[5].trim());
				
				// make smth for the target year, if the subject is python and the year is fall 2022
				// python becomes c++ and the year becomes 2022 or 2023
				
				instructorList.add(instructor);
			}
			count++;
		}
		
		br.close();
		return instructorList;
		
	}
	
}
