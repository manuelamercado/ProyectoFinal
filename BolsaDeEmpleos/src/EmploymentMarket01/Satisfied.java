package EmploymentMarket01;

import java.util.ArrayList;

public class Satisfied {
	
	private ArrayList<CompanyApplication> SatisfiedCompany;
	private int CantSatisfiedCompany;
	private ArrayList<PersonApplication> SatisfiedPerson;
	private int CantSatisfiedPerson;
	private ArrayList<CompanyPerson> SatisfiedEmployes;
	private CollectionPerson  PersonSatisfied;
	private CollectionCompany CompanySatisfied;
	private CollectionPersonApplicant PendingPersonApplication;
	private CollectionCompanyApplication PendingCompanyApplication;
	private static Satisfied satisfied;
		
	public Satisfied(ArrayList<CompanyApplication> satisfiedCompany,
			int cantSatisfiedCompany,
			ArrayList<PersonApplication> satisfiedPerson,
			int cantSatisfiedPerson,
			ArrayList<CompanyPerson> satisfiedEmployes,
			CollectionPerson personSatisfied,
			CollectionCompany companySatisfied,
			CollectionPersonApplicant pendingPersonApplication,
			CollectionCompanyApplication pendingCompanyApplication) {
		super();
		SatisfiedCompany = satisfiedCompany;
		CantSatisfiedCompany = 0;
		SatisfiedPerson = satisfiedPerson;
		CantSatisfiedPerson = 0;
		SatisfiedEmployes = satisfiedEmployes;
		PersonSatisfied = personSatisfied;
		CompanySatisfied = companySatisfied;
		PendingPersonApplication = pendingPersonApplication;
		PendingCompanyApplication = pendingCompanyApplication;
	}
	
	public static Satisfied getInstanceSatisfied() {
		if (satisfied == null) {
			satisfied = new Satisfied();
		}
		return satisfied;
	}
	
	private Satisfied() {
		SatisfiedCompany = new ArrayList<CompanyApplication>();
		CantSatisfiedCompany = 0;
		SatisfiedPerson = new ArrayList<PersonApplication>();
		CantSatisfiedPerson = 0;
		SatisfiedEmployes = new ArrayList<CompanyPerson>();
		PersonSatisfied = CollectionPerson.getInstanceCollectionPerson();
		CompanySatisfied = CollectionCompany.getInstanceCollectionCompany();
		PendingPersonApplication = CollectionPersonApplicant.getInstanceCollectionPersonApplicant();
		PendingCompanyApplication = CollectionCompanyApplication.getInstanceCollectionCompanyApplication();	
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
	public CollectionPerson getPersonSatisfied() {
		return PersonSatisfied;
	}
	public void setPersonSatisfied(Person personSatisfied) {
		PersonSatisfied.setPersons(personSatisfied);
	}
	public CollectionCompany getCompanySatisfied() {
		return CompanySatisfied;
	}
	public void setCompanySatisfied(Company companySatisfied) {
		CompanySatisfied.setCompanies(companySatisfied);
	}
	
	public CollectionPersonApplicant getPendingPersonApplication(CollectionPersonApplicant PersonApplication) {
		setPendingPersonApplication(PersonApplication);
		return PendingPersonApplication;
	}
	public void setPendingPersonApplication(CollectionPersonApplicant PersonApplication) {
		for(int i=0; i<PersonApplication.getPersonApplicantions().size(); i++)
			if(PersonApplication.getPersonApplication(i).isSatisfied()==false)
				PendingPersonApplication.setPersonApplicantions(PersonApplication.getPersonApplication(i));
	}
	public CollectionCompanyApplication getPendingCompanyApplication(CollectionCompanyApplication CompanyApplication) {
		setPendingCompanyApplication(CompanyApplication);
		return PendingCompanyApplication;
	}
	public void setPendingCompanyApplication(CollectionCompanyApplication CompanyApplication) {
		for(int i=0; i<CompanyApplication.getCompanyApplications().size(); i++)
			if(CompanyApplication.getCompanyApplication(i).isSatisfied()==false)
				PendingCompanyApplication.setCompanyApplications(CompanyApplication.getCompanyApplication(i));
	}
	public ArrayList<CompanyPerson> SearchPersonHistory(Person P1){
		ArrayList<CompanyPerson>PersonHistory=new ArrayList<CompanyPerson>();
		for(int i=0; i<SatisfiedEmployes.size(); i++)
		if(P1.getID().equals(SatisfiedEmployes.get(i).getPerson().getID())){
			PersonHistory.add(SatisfiedEmployes.get(i));
		}
		return PersonHistory;
	}
	
}