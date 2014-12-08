package EmploymentMarket01;

public class CompanyPerson {
	private Company company;
	private Person person;
	private String WorkPosition;
	private String Area;
	
	
	
	public CompanyPerson(Company company, Person person, String workPosition,
			String area) {
		super();
		this.company = company;
		this.person = person;
		WorkPosition = workPosition;
		Area = area;
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
	public String getWorkPosition() {
		return WorkPosition;
	}
	public void setWorkPosition(String workPosition) {
		WorkPosition = workPosition;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	
	
}