package EmploymentMarket01;

import java.util.ArrayList;

public class Satisfied {
	
	private ArrayList<CompanyApplication> SatisfiedCompany;
	private ArrayList<PersonApplication> SatisfiedPerson;
	private ArrayList<CompanyPerson> SatisfiedEmployes;
	
	public ArrayList<CompanyApplication> getSatisfiedCompany() {
		return SatisfiedCompany;
	}
	public void setSatisfiedCompany(CompanyApplication satisfiedCompany) {
		SatisfiedCompany.add(satisfiedCompany);
	}
	public ArrayList<PersonApplication> getSatisfiedPerson() {
		return SatisfiedPerson;
	}
	public void setSatisfiedPerson(PersonApplication satisfiedPerson) {
			SatisfiedPerson.add(satisfiedPerson);
	}
	public ArrayList<CompanyPerson> getSatisfiedEmployes() {
		return SatisfiedEmployes;
	}
	public void setSatisfiedEmployes(CompanyPerson satisfiedEmployes) {
		SatisfiedEmployes.add(satisfiedEmployes);
	}
	
	
	

}
