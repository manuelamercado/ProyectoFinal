package EmploymentMarket01;

import java.util.ArrayList;

public class Technical extends Person {

	private ArrayList<String> espTitle;
	private ArrayList<String> TechTitles;
	private ArrayList<String> works;

	public Technical(String Name, String LastName, String ID, String Phone,
			String Mobile, String Email, String sex, String Birth,
			String Country, String City, String Sector, String Calle,
			String HouseNumber, String PostalCode, String Nationality,
			String CivilState, String AcademicLevel, int YearsExperience,
			String Title, String gradelevel, String country) {
		super(Name, LastName, ID, Phone, Mobile, Email, sex, Birth, City,
				Sector, Calle, HouseNumber, PostalCode, Nationality,
				CivilState, AcademicLevel, YearsExperience, country);

	}

	public Technical() {
		super();
		espTitle= new ArrayList<String>();
		TechTitles = new ArrayList<String>();
		works= new ArrayList<String>();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getLastName() {
		return super.getLastName();
	}

	@Override
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}

	@Override
	public String getID() {
		return super.getID();
	}

	@Override
	public void setID(String iD) {
		super.setID(iD);
	}

	@Override
	public String getPhone() {
		return super.getPhone();
	}

	@Override
	public void setPhone(String phone) {
		super.setPhone(phone);
	}

	@Override
	public String getMobile() {
		return super.getMobile();
	}

	@Override
	public void setMobile(String mobile) {
		super.setMobile(mobile);
	}

	@Override
	public String getEmail() {
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		super.setEmail(email);
	}

	@Override
	public String getBirth() {
		return super.getBirth();
	}

	@Override
	public void setBirth(String birth) {
		super.setBirth(birth);
	}

	@Override
	public Address getAddress() {
		return super.getAddress();
	}

	@Override
	public void setAddress(Address address) {
		super.setAddress(address);
	}

	@Override
	public String getNationality() {
		return super.getNationality();
	}

	@Override
	public void setNationality(String nationality) {
		super.setNationality(nationality);
	}

	@Override
	public int getYearsExperience() {
		return super.getYearsExperience();
	}

	@Override
	public void setYearsExperience(int yearsExperience) {
		super.setYearsExperience(yearsExperience);
	}

	@Override
	public String getSex() {
		return super.getSex();
	}

	@Override
	public String getCivilState() {
		return super.getCivilState();
	}

	@Override
	public void setCivilState(String civilState) {
		super.setCivilState(civilState);
	};

	@Override
	public String getAcademicLevel() {
		return super.getAcademicLevel();
	}

	@Override
	public void setSex(String sex) {
		super.setSex(sex);
	}

	@Override
	public void setAcademicLevel(String academicLevel) {
		super.setAcademicLevel(academicLevel);
	}

	@Override
	public String getWorkingDay() {
		return super.getWorkingDay();
	}

	@Override
	public void setWorkingDay(String workingDay) {
		super.setWorkingDay(workingDay);
	}

	@Override
	public String getCity() {
		return super.getCity();
	}

	@Override
	public void setCity(String city) {
		super.setCity(city);
	}

	@Override
	public String getSector() {
		return super.getSector();
	}

	@Override
	public void setSector(String sector) {
		super.setSector(sector);
	}

	@Override
	public String getCalle() {
		return super.getCalle();
	}

	@Override
	public void setCalle(String calle) {
		super.setCalle(calle);
	}

	@Override
	public String getHouseNumber() {
		return super.getHouseNumber();
	}

	@Override
	public void setHouseNumber(String houseNumber) {
		super.setHouseNumber(houseNumber);
	}

	@Override
	public String getPostalCode() {
		return super.getPostalCode();
	}

	@Override
	public void setPostalCode(String postalCode) {
		super.setPostalCode(postalCode);
	}

	public ArrayList<String> getEspTitle() {
		return espTitle;
	}

	public void setEspTitle(String title) {
		this.espTitle.add(title);
	}

	public ArrayList<String> getTechTitles() {
		return TechTitles;
	}

	public void setTechTitles(ArrayList<String> othersTitles) {
		TechTitles = othersTitles;
	}
	public void setTechTitles(String othersTitles) {
		TechTitles.add(othersTitles);
	}

	public ArrayList<String> getWorks() {
		return works;
	}

	public void setWorks(ArrayList<String> works) {
		this.works = works;
	}
	
	public void setWorks(String works) {
		this.works.add(works);
	}
	public String getCountry() {
		return super.getCountry();
	}

	@Override
	public void setCountry(String c) {
		super.setCountry(c);
	}

}