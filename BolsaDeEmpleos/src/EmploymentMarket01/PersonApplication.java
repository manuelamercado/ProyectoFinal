package EmploymentMarket01;

import java.util.ArrayList;

public class PersonApplication {
	
	
	public enum Grade {};
	public CompanyType Area;
	private ArrayList<String> WorkPosition;
	private boolean Satisfied; 
	
	
	
	public PersonApplication(CompanyType area, ArrayList<String> workPosition,
			boolean satisfied) {
		super();
		Area = area;
		WorkPosition = workPosition;
		Satisfied = satisfied;
	}
	public ArrayList<String> getWorkPosition() {
		return WorkPosition;
	}
	public void setWorkPosition(ArrayList<String> workPosition) {
		WorkPosition = workPosition;
	}
	public CompanyType getArea() {
		return Area;
	}
	public void setArea(CompanyType area) {
		Area = area;
	}
	public boolean isSatisfied() {
		return Satisfied;
	}
	public void setSatisfied(boolean satisfied) {
		Satisfied = satisfied;
	}
	

}
