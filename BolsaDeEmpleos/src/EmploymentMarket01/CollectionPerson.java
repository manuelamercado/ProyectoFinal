package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionPerson {
	private ArrayList<Person> Persons;
	
	public CollectionPerson(ArrayList<Person> persons) {
		super();
		Persons = persons;
	}

	public ArrayList<Person> getPersons() {
		return Persons;
	}

	public void setPersons(Person persons) {
		Persons.add(persons);
		Order(Persons);
	}
	
	public void Order(ArrayList<Person> Persons){
		Collections.sort(Persons, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2){
				return new String(p1.getLastName()).compareTo(p2.getLastName());
			}
		});
	}
}
