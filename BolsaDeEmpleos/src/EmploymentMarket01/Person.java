package EmploymentMarket01;

import java.util.Date;

public abstract class Person {

	private String Name;
	private String LastName;
	private String ID;
	private String Phone;
	private String Mobile;
	private String Email;
	private Date Birth;
	private Address Address;
	private String Nationality;
	private String CivilState;
	private String AcademicLevel;
	private int YearsExperience;
	private String WorkingDay;
	private String sex;
	private boolean Duty;

	public Person(String Name, String LastName, String ID, String Phone,
			String Mobile, String Email, String sex, Date Birth, String City,
			String Sector, String Calle, int HouseNumber, long PostalCode,
			String Nationality, String CivilState, String AcademicLevel,
			int YearsExperience) {

		this.Name = Name;
		this.LastName = LastName;
		this.ID = ID;
		this.Phone = Phone;
		this.Mobile = Mobile;
		this.Email = Email;
		this.sex = sex;
		this.Birth = Birth;
		Address = new Address(City, Sector, Calle, HouseNumber, PostalCode);
		this.Nationality = Nationality;
		this.YearsExperience = YearsExperience;
		this.Duty=false;
	}

	public Person() {
		Name = " ";
		LastName = "";
		ID = "";
		Phone = "";
		Mobile = "";
		Email = "";
		sex = "";
		Birth = new Date(0);
		this.Address = new Address("", "", "", 0, 0);
		Nationality = "";
		YearsExperience = 0;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getBirth() {
		return Birth;
	}

	public void setBirth(Date birth) {
		Birth = birth;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public int getYearsExperience() {
		return YearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		YearsExperience = yearsExperience;
	}

	public String getSex() {
		return sex;
	}

	public String getCivilState() {
		return CivilState;
	}

	public void setCivilState(String civilState) {
		CivilState = civilState;
	};

	public String getAcademicLevel() {
		return AcademicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		AcademicLevel = academicLevel;
	}

	public String getWorkingDay() {
		return WorkingDay;
	}

	public void setWorkingDay(String workingDay) {
		WorkingDay = workingDay;
	}

	public String getCity() {
		return Address.getCity();
	}

	public void setCity(String city) {
		Address.setCity(city);
	}

	public String getSector() {
		return Address.getSector();
	}

	public void setSector(String sector) {
		Address.setSector(sector);
	}

	public String getCalle() {
		return Address.getCalle();
	}

	public void setCalle(String calle) {
		Address.setCalle(calle);
	}

	public int getHouseNumber() {
		return Address.getHouseNumber();
	}

	public void setHouseNumber(int houseNumber) {
		Address.setHouseNumber(houseNumber);
	}

	public long getPostalCode() {
		return Address.getPostalCode();
	}

	public void setPostalCode(long postalCode) {
		Address.setPostalCode(postalCode);
	}

	public boolean isDuty() {
		return Duty;
	}

	public void setDuty(boolean duty) {
		Duty = duty;
	}
	

}