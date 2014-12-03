package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Date;

public class DreamerNini extends Person {
	private ArrayList<String> courseTitles;
	private ArrayList<String> works;

	public DreamerNini(String Name, String LastName, String ID, String Phone,
			String Mobile, String Email, String sex, Date Birth,
			String Country, String City, String Sector, String Calle,
			int HouseNumber, long PostalCode, String Nationality,
			String CivilState, String AcademicLevel, int YearsExperience) {
		super(Name, LastName, ID, Phone, Mobile, Email, sex, Birth, City,
				Sector, Calle, HouseNumber, PostalCode, Nationality,
				CivilState, AcademicLevel, YearsExperience);
		// TODO Auto-generated constructor stub
	}

	public DreamerNini() {
		super();
		courseTitles= new ArrayList<String>();
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
	public Date getBirth() {
		return super.getBirth();
	}

	@Override
	public void setBirth(Date birth) {
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
	public void setSex(String sex) {
		super.setSex(sex);
	}

	@Override
	public String getAcademicLevel() {
		return super.getAcademicLevel();
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
	public int getHouseNumber() {
		return super.getHouseNumber();
	}

	@Override
	public void setHouseNumber(int houseNumber) {
		super.setHouseNumber(houseNumber);
	}

	@Override
	public long getPostalCode() {
		return super.getPostalCode();
	}

	@Override
	public void setPostalCode(long postalCode) {
		super.setPostalCode(postalCode);
	}

	public ArrayList<String> getcourseTitles() {
		return courseTitles;
	}

	public void setCourseTitles(ArrayList<String> otherTitles) {
		this.courseTitles = otherTitles;
	}
	public void setCourseTitles(String otherTitles) {
		this.courseTitles.add(otherTitles);
	}

	public ArrayList<String> getWorks() {
		return works;
	}

	public void setWorks(ArrayList<String> titles) {
		this.works = titles;
	}
	public void setWorks(String titles) {
		this.works.add(titles);
	}

}