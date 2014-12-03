package EmploymentMarket01;

import java.util.ArrayList;

public class CollectionCompanyApplication {
	private ArrayList<CompanyApplication> CompanyApplications;

	public CollectionCompanyApplication(ArrayList<CompanyApplication> companyApplications) {
		super();
		CompanyApplications = companyApplications;
	}

	public ArrayList<CompanyApplication> getCompanyApplications() {
		return CompanyApplications;
	}

	public void setCompanyApplications(CompanyApplication companyApplications) {
		CompanyApplications.add(companyApplications);
	}
	
	public CompanyApplication getCompanyApplication(int i){
		return CompanyApplications.get(i);
	}

}