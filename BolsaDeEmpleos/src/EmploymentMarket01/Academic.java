package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Date;

public class Academic extends Person{
	
	public String Title;
	public GradeLevel gradelevel;
	private ArrayList<Titles> OthersTitles;
	
	
public Academic(String Name, String LastName, String Mobile, String Email,
			Date Birth, Address Address, String Nationality,
			int Age, String Phone, String ID, int YearsExperience)
	{
		super(Name, LastName, Mobile, Email, Birth, Address, Nationality, Age, Phone,
				ID, YearsExperience);
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public GradeLevel getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(GradeLevel gradelevel) {
		this.gradelevel = gradelevel;
	}

	public ArrayList<Titles> getOthersTitles() {
		return OthersTitles;
	}

	public void setOthersTitles(ArrayList<Titles> othersTitles) {
		OthersTitles = othersTitles;
	}

}
