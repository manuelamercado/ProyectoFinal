package EmploymentMarket01;

import java.util.ArrayList;

public class CollectionPersonApplicant {
	private ArrayList<PersonApplication> PersonApplications;

	public CollectionPersonApplicant(
			ArrayList<PersonApplication> personApplicantions) {
		super();
		PersonApplications = personApplicantions;
	}

	public ArrayList<PersonApplication> getPersonApplicantions() {
		return PersonApplications;
	}

	public void setPersonApplicantions(
			ArrayList<PersonApplication> personApplicantions) {
		PersonApplications = personApplicantions;
	}
	
	public void Clean(Person D1, ArrayList<PersonApplication> PersonApplications){
		if(D1.isDuty()==true){
			for(int i=0; i<PersonApplications.size(); i++){
				if(PersonApplications.get(i).getPerson().getID().equals(D1.getID())){
					PersonApplications.remove(i);
				}
			}
		}
	}
}
