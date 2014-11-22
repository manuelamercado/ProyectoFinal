package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionPerson {
	private ArrayList<Person> Persons;
	private int CantPerson;
	
	
	public CollectionPerson(ArrayList<Person> persons, int cantPerson) {
		super();
		Persons = persons;
		CantPerson = cantPerson;
	}

	public ArrayList<Person> getPersons() {
		return Persons;
	}

	public void setPersons(Person persons) {
		if(verify(persons)){
		Persons.add(persons);
		setCantPerson(CantPerson =+1);
		Order(Persons);
		}
	}
	
	
	public int getCantPerson() {
		return CantPerson;
	}

	public void setCantPerson(int cantPerson) {
		CantPerson = cantPerson;
	}

	private void Order(ArrayList<Person> Persons){
		Collections.sort(Persons, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2){
				return new String(p1.getLastName()).compareTo(p2.getLastName());
			}
		});
	}
	
	private boolean verify(Person P1){
		boolean check = true;
		for(int i=0; i<Persons.size(); i++){
			if(Persons.get(i).getID().equals(P1.getID())){
				check=false;
			}
		}
		return check;
	}
}
