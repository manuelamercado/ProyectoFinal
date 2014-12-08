	package EmploymentMarket01;

import java.util.ArrayList;

public class Academic extends Person {

	private ArrayList<String> gradeTitle;
	private String gradelevel;
	private ArrayList<String> technicalTitles;
	private ArrayList<String> postGradeTitles;
	private ArrayList<String> DoctorateTitles;
	private ArrayList<String> espTitles;

	public Academic(String Name, String LastName, String ID, String Phone,
			String Mobile, String Email, String sex, String Birth,
			String Country, String City, String Sector, String Calle,
			String HouseNumber, String PostalCode, String Nationality,
			String CivilState, String AcademicLevel, int YearsExperience,
			ArrayList<String> Title, String gradelevel, String country) {
		super(Name, LastName, ID, Phone, Mobile, Email, sex, Birth, City,
				Sector, Calle, HouseNumber, PostalCode, Nationality,
				CivilState, AcademicLevel, YearsExperience, country);
		
		this.setGradeTitle(Title);
		this.gradelevel = gradelevel;
		//
	}

	public Academic() {
		super();
		setGradeTitle(new ArrayList<String>());
		setTechnicalTitles(new ArrayList<String>());
		setCertTitles(new ArrayList<String>());
		setPostGradeTitles(new ArrayList<String>());
		setDoctorateTitles(new ArrayList<String>());
		setEspTitles(new ArrayList<String>());
		gradelevel = "";
	}

	@Override
	public void setSex(String sex) {
		super.setSex(sex);
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


	public String getGradelevel() {
		return gradelevel;
	}

	public void setGradeLevel(String gradelevel) {
		this.gradelevel = gradelevel;
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
	public String getCountry() {
		return super.getCountry();
	}

	@Override
	public void setCountry(String c) {
		super.setCountry(c);
	}
	public ArrayList<String> getGradeTitle() {
		return gradeTitle;
	}

	public void setGradeTitle(ArrayList<String> gradeTitle) {
		this.gradeTitle = gradeTitle;
	}
	
	public void setGradeTitle(String gradeTitle) {
		this.gradeTitle.add(gradeTitle);
	}

	public ArrayList<String> getTechnicalTitles() {
		return technicalTitles;
	}

	public void setTechnicalTitles(ArrayList<String> technicalTitles) {
		this.technicalTitles = technicalTitles;
	}
	
	public void setTechnicalTitles(String technicalTitles) {
		this.technicalTitles.add(technicalTitles);
	}

	public ArrayList<String> getCertTitles() {
		return super.getCertTitles();
	}

	public void setCertTitles(ArrayList<String> otherTitles) {
		super.setCertTitles(otherTitles);
	}
	public void setCertTitles(String otherTitles) {
		super.setCertTitles(otherTitles);
	}
	public ArrayList<String> getPostGradeTitles() {
		return postGradeTitles;
	}

	public void setPostGradeTitles(ArrayList<String> postGradeTitles) {
		this.postGradeTitles = postGradeTitles;
	}

	public void setPostGradeTitles(String postGradeTitles) {
		this.postGradeTitles.add(postGradeTitles);
	}
	
	public ArrayList<String> getDoctorateTitles() {
		return DoctorateTitles;
	}

	public void setDoctorateTitles(ArrayList<String> doctorateTitles) {
		DoctorateTitles = doctorateTitles;
	}
	
	public void setDoctorateTitles(String doctorateTitles) {
		DoctorateTitles.add(doctorateTitles);
	}

	public ArrayList<String> getEspTitles() {
		return espTitles;
	}

	public void setEspTitles(ArrayList<String> espTitles) {
		this.espTitles = espTitles;
	}
	
	public void setEspTitles(String espTitles) {
		this.espTitles.add(espTitles);

}


}