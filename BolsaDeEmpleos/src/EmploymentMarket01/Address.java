package EmploymentMarket01;

public class Address {

	public String City;
	public String Sector;
	public String Calle;
	public int HouseNumber;
	public long PostalCode;

	public Address(String City, String Sector, String Calle, int HouseNumber,
			long PostalCode) {

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

	public int getHouseNumber() {
		return HouseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		HouseNumber = houseNumber;
	}

	public long getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(long postalCode) {
		PostalCode = postalCode;
	}

}
