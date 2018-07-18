package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {
	
	public String findGrade(Student studentObject) {
		int[] arrMarks = studentObject.getMarks();
		for(int i=0;i<arrMarks.length;i++) 
			if(arrMarks[i]<35)
				return "F";
			else {
				int sum=0;
				for(int j=0;j<arrMarks.length;j++) {
					sum+=arrMarks[j];
				}
				if(sum<=150)
					return "D";
				else if(sum>150 && sum<=200)
					return "C";
				else if(sum>200 && sum<=250)
					return "B";
				else if(sum>250 && sum<=300)
					return "A";
			}
		return null;
	}
	public String validate(Student studentObject) throws NullStudentException,NullNameException,NullMarksArrayException {
			if(studentObject==null)
				throw new NullStudentException();
			else {
				if(studentObject.getName()==null)
					throw new NullNameException();
				if(studentObject.getMarks()==null)
					throw new NullMarksArrayException();
			}
		
		return findGrade(studentObject);
	}
}
