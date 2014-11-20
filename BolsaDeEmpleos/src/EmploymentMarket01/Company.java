package EmploymentMarket01;

public class Company {
	
	public String Name;
	public String WebPage;
	public CompanyType Sector;
	
	public Company(String name, String webPage, CompanyType sector) {
		super();
		Name = name;
		WebPage = webPage;
		Sector = sector;
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
	public CompanyType getSector() {
		return Sector;
	}
	public void setSector(CompanyType sector) {
		Sector = sector;
	}
	

}
