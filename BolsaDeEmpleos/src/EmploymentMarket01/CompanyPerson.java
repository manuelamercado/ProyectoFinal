package EmploymentMarket01;

public class CompanyPerson {
	
	private Company company;
	private Person person;
	
	public CompanyPerson(Company company, Person person) {
		super();
		this.company = company;
		this.person = person;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
