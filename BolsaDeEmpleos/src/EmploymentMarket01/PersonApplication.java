package EmploymentMarket01;

import java.util.ArrayList;

public class PersonApplication {
	
	
	private enum Grade {};
	private CompanyType Area;
	private ArrayList<String> WorkPosition;
	private boolean Satisfied;
	private Person Person;
	
	
	
	
	public PersonApplication(CompanyType area, ArrayList<String> workPosition,
			boolean satisfied, EmploymentMarket01.Person person) {
		super();
		Area = area;
		WorkPosition = workPosition;
		Satisfied = satisfied;
		Person = person;
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
	public Person getPerson() {
		return Person;
	}
	public void setPerson(Person person) {
		Person = person;
	}
}