package assignment_2.quickstart;

import java.util.ArrayList;

public class Module
{
	private ArrayList<Student> students = new ArrayList();
	private ArrayList<CourseProgramme> courses = new ArrayList();
	private String name;
	private String id;
	
	public Module(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public void addCourse(CourseProgramme course)
	{
		courses.add(course);
	}
}

