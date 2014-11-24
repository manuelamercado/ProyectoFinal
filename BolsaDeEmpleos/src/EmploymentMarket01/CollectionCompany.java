package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionCompany {

	private ArrayList<Company> Companies;
	private int CantCompany;
	private static CollectionCompany collectionCompany;

	public void setCollectionCompany(ArrayList<Company> companies,
			int cantCompany) {
		Companies = companies;
		CantCompany = cantCompany;
	}

	private CollectionCompany() {
		Companies = new ArrayList<Company>();
		CantCompany = 0;
	}

	public static CollectionCompany getInstanceCollectionCompany() {
		if (collectionCompany == null) {
			collectionCompany = new CollectionCompany();
		}
		return collectionCompany;
	}

	public ArrayList<Company> getCompanies() {
		return Companies;
	}

	public void setCompanies(Company companies) {
		Companies.add(companies);
		Order(Companies);
		setCantCompany(CantCompany = +1);
	}

	public int getCantCompany() {
		return CantCompany;
	}

	public void setCantCompany(int cantCompany) {
		CantCompany = cantCompany;
	}

	private void Order(ArrayList<Company> companies) {
		Collections.sort(Companies, new Comparator<Company>() {
			@Override
			public int compare(Company p1, Company p2) {
				return new String(p1.getName()).compareTo(p2.getName());
			}
		});
	}
}