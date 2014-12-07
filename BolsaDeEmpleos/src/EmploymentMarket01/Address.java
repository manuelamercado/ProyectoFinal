package EmploymentMarket01;

public class Address {

	private String City;
	private String Sector;
	private String Calle;
	private String HouseNumber;
	private String PostalCode;
	private String region;
	

	public Address(String City, String Sector, String Calle, String HouseNumber,
			String PostalCode) {

		this.City = City;
		this.Sector = Sector;
		this.Calle = Calle;
		this.HouseNumber = HouseNumber;
		this.PostalCode = PostalCode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public String getHouseNumber() {
		return HouseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		HouseNumber = houseNumber;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}


}