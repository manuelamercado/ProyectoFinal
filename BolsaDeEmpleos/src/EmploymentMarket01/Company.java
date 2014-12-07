package EmploymentMarket01;

import EmploymentMarket01.Address;
import EmploymentMarket01.CompanyType;

public class Company {

	private String Name;
	private String WebPage;
	private CompanyType AreaC;
	private Address addressCompany;
	private String area;
	private String ID;
	private String Phone;
	private String Fax;
	private String Email;
	private String RNC;
	private String country;
	private String fund;
	private String activity;

	public Company(String name, String webPage, CompanyType area2,
			String area1, Address address) {
		Name = name;
		WebPage = webPage;
		setAreaC(area2);
		area = area1;
		addressCompany = address;
	}

	public Company() {
		Name = "";
		WebPage = "";
		area = "";
		ID = "";
		Phone = "";
		Fax = "";
		Email = "";
		addressCompany = new Address("", "", "", "", "");
		setRNC("");
	}

	public Company(String name, String webPage, String area1, String City,
			String Sector, String Calle, String HouseNumber, String PostalCode) {
		Name = name;
		WebPage = webPage;
		area = area1;
		addressCompany.setCity(City);
		addressCompany.setSector(Sector);
		addressCompany.setCalle(Calle);
		addressCompany.setHouseNumber(HouseNumber);
		addressCompany.setPostalCode(PostalCode);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getWebPage() {
		return WebPage;
	}

	public void setWebPage(String webPage) {
		WebPage = webPage;
	}

	public Address getAddressCompany() {
		return addressCompany;
	}

	public void setAddressCompany(Address addressCompany) {
		this.addressCompany = addressCompany;
	}

	public String getCity() {
		return addressCompany.getCity();
	}

	public void setCity(String city) {
		addressCompany.setCity(city);
	}

	public String getSector() {
		return addressCompany.getSector();
	}

	public void setSector(String sector) {
		addressCompany.setSector(sector);
	}

	public String getCalle() {
		return addressCompany.getCalle();
	}

	public void setCalle(String calle) {
		addressCompany.setCalle(calle);
	}

	public String getHouseNumber() {
		return addressCompany.getHouseNumber();
	}

	public void setHouseNumber(String houseNumber) {
		addressCompany.setHouseNumber(houseNumber);
	}

	public String getPostalCode() {
		return addressCompany.getPostalCode();
	}

	public void setPostalCode(String postalCode) {
		addressCompany.setPostalCode(postalCode);
	}

	public CompanyType getAreaC() {
		return AreaC;
	}

	public void setAreaC(CompanyType area1) {
		AreaC = area1;
	}

	public void setArea(String area2) {
		this.area = area2;
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

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getArea() {
		return area;
	}

	public String getRNC() {
		return RNC;
	}

	public void setRNC(String rNC) {
		RNC = rNC;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
