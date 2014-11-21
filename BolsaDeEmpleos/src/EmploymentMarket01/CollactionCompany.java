package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollactionCompany {
	
	private ArrayList<Company> Companies;

	public CollactionCompany(ArrayList<Company> companies) {
		super();
		Companies = companies;
	}

	public ArrayList<Company> getCompanies() {
		return Companies;
	}

	public void setCompanies(Company companies) {
		Companies.add(companies);
		Order(Companies);
	}
	
	public void Order(ArrayList<Company> companies){
		Collections.sort(Companies, new Comparator<Company>(){
			@Override
			public int compare(Company p1, Company p2){
				return new String(p1.getName()).compareTo(p2.getName());
			}
		});
	}

}
