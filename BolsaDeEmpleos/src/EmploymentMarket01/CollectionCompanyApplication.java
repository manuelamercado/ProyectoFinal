package EmploymentMarket01;

import java.util.ArrayList;

public class CollectionCompanyApplication {
	private ArrayList<CompanyApplication> CompanyApplications;
	private static CollectionCompanyApplication collectionCompanyApplication;
	
	public static CollectionCompanyApplication getInstanceCollectionCompanyApplication() {
		if (collectionCompanyApplication == null) {
			collectionCompanyApplication = new CollectionCompanyApplication();
		}
		return collectionCompanyApplication;
	}
	
	private CollectionCompanyApplication() {
		CompanyApplications = new ArrayList<CompanyApplication>();	
	}
	
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
	}}
