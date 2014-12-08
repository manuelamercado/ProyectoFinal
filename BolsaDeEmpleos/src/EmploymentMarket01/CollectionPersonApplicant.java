package EmploymentMarket01;

import java.util.ArrayList;

public class CollectionPersonApplicant {
	private ArrayList<PersonApplication> PersonApplications;
	private static CollectionPersonApplicant collectionPersonApplicant;

	public CollectionPersonApplicant(
			ArrayList<PersonApplication> personApplicantions) {
		super();
		PersonApplications = personApplicantions;
	}
	public static CollectionPersonApplicant getInstanceCollectionPersonApplicant() {
		if (collectionPersonApplicant == null) {
			collectionPersonApplicant = new CollectionPersonApplicant();
		}
		return collectionPersonApplicant;
	}
	
	private CollectionPersonApplicant() {
		PersonApplications = new ArrayList<PersonApplication>();	
	}
	
	public Person getPerson(String ID) {
				Person temp = null;
				for (int i = 0; i < PersonApplications.size(); i++) {
					if ((PersonApplications.get(i).getPerson().getID().equals(ID))) {
						temp= PersonApplications.get(i).getPerson();
						// setCantPerson(CantPerson-1);
					}
				}
				return temp;
			}

	public ArrayList<PersonApplication> getPersonApplicantions() {
		return PersonApplications;
	}

	public void setPersonApplicantions(PersonApplication personApplicantions) {
		PersonApplications.add(personApplicantions);
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
	
	public PersonApplication getPersonApplication(int i){
		return PersonApplications.get(i);
	}
}