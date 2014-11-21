package EmploymentMarket01;

import java.util.ArrayList;

public class Satisfied {
	
	private ArrayList<CompanyApplication> SatisfiedCompany;
	private int CantSatisfiedCompany;
	private ArrayList<PersonApplication> SatisfiedPerson;
	private int CantSatisfiedPerson;
	private ArrayList<CompanyPerson> SatisfiedEmployes;
	
	
	public Satisfied(ArrayList<CompanyApplication> satisfiedCompany,
			int cantSatisfiedCompany,
			ArrayList<PersonApplication> satisfiedPerson,
			int cantSatisfiedPerson, ArrayList<CompanyPerson> satisfiedEmployes) {
		super();
		SatisfiedCompany = satisfiedCompany;
		CantSatisfiedCompany = 0;
		SatisfiedPerson = satisfiedPerson;
		CantSatisfiedPerson = 0;
		SatisfiedEmployes = satisfiedEmployes;
	}
	public ArrayList<CompanyApplication> getSatisfiedCompany() {
		return SatisfiedCompany;
	}
	public void setSatisfiedCompany(CompanyApplication satisfiedCompany) {
		SatisfiedCompany.add(satisfiedCompany);
		setCantSatisfiedCompany(CantSatisfiedCompany =+1);
	}
	public ArrayList<PersonApplication> getSatisfiedPerson() {
		return SatisfiedPerson;
	}
	public void setSatisfiedPerson(PersonApplication satisfiedPerson) {
			SatisfiedPerson.add(satisfiedPerson);
			setCantSatisfiedPerson(CantSatisfiedPerson =+1);
	}
	public ArrayList<CompanyPerson> getSatisfiedEmployes() {
		return SatisfiedEmployes;
	}
	public void setSatisfiedEmployes(CompanyPerson satisfiedEmployes) {
		SatisfiedEmployes.add(satisfiedEmployes);
	}
	public int getCantSatisfiedCompany() {
		return CantSatisfiedCompany;
	}
	public void setCantSatisfiedCompany(int cantSatisfiedCompany) {
		CantSatisfiedCompany = cantSatisfiedCompany;
	}
	public int getCantSatisfiedPerson() {
		return CantSatisfiedPerson;
	}
	public void setCantSatisfiedPerson(int cantSatisfiedPerson) {
		CantSatisfiedPerson = cantSatisfiedPerson;
	}
	
	
	
	

}
