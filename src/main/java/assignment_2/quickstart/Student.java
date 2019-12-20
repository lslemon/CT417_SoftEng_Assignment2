package assignment_2.quickstart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

//import java.util.Date;
//import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Student
{
	private String name;
	private String DOB;
	private String username;
	private int age;
	private long ID;
	//private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private DateTimeFormatter format = DateTimeFormat.forPattern("dd/MM/yyyy");
	
	public Student(String name, String DOB)
	{
		this.name = name;
		this.DOB = DOB;
		setUsername();
	}
	
	public int getAge()
	{
		DateTime now = new DateTime();
		DateTime dateOfBirth = new DateTime();
		try {
			dateOfBirth = format.pa(DOB);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.print("Date Format Error");
			e.printStackTrace();
		}
		long diffMillis = Math.abs(now.getTime() - dateOfBirth.getTime());
		long diff = TimeUnit.DAYS.convert(diffMillis, TimeUnit.MILLISECONDS);
		int years = (int) (diff/365);
		return years;
	}
	
	public void setUsername()
	{
		username = name.replaceAll("\\s", "") + getAge();
		//username = username.replace("\\s", "");
	}
	
	public String getUsername()
	{
		return username;
	}
}
