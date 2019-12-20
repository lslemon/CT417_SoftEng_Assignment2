package assignment_2.quickstart;

import java.util.ArrayList;
import java.util.Date;

public class CourseProgramme
{
	private String name;
	private ArrayList<Module> modules = new ArrayList();
	private ArrayList<Student> students = new ArrayList();
	private Date startDate;
	private Date endDate;
	
	
	
	public CourseProgramme(String name, Date startDate, Date endDate)
	{
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
