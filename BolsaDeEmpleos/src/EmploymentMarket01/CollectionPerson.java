package EmploymentMarket01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionPerson {
	private ArrayList<Person> Persons;
	private int CantPerson;
	private static CollectionPerson collectionPerson;

	public void setCollectionPerson(ArrayList<Person> persons, int cantPerson) {
		Persons = persons;
		CantPerson = cantPerson;
	}

	public static CollectionPerson getInstanceCollectionPerson() {
		if (collectionPerson == null) {
			collectionPerson = new CollectionPerson();
		}
		return collectionPerson;

	}

	private CollectionPerson() {
		Persons = new ArrayList<Person>();
		CantPerson = 0;
	}

	public ArrayList<Person> getPersons() {
		return Persons;
	}

	/*public void setPersons(Person persons) {
		if (verify(persons)) {
			if(!(persons.getAcademicLevel().equalsIgnoreCase("Technical"))){
				Person P1 = new Technical();
				Persons.add(P1);
				setCantPerson(CantPerson = +1);
				Order(Persons);
			}else if(!(persons.getAcademicLevel().equalsIgnoreCase("Universitary"))){
				Person P1 = new Academic();
				Persons.add(P1);
				setCantPerson(CantPerson = +1);
				Order(Persons);
			}else if(!(persons.getAcademicLevel().equalsIgnoreCase("Other"))){
				Person P1 = new DreamerNini();
				Persons.add(P1);
				setCantPerson(CantPerson = +1);
				Order(Persons);
			}
			
		}
	}*/
	public void setPersons(Person persons) {
		if (verify(persons)) {
				Persons.add(persons);
				CantPerson+=1;
				//setCantPerson(CantPerson  +=1);
				Order(Persons);
		}
	}
	
	public void addacademic(Academic a){
		Persons.add(a);
		CantPerson+=1;
	}
	public int getCantPerson() {
		return CantPerson;
	}

	public void setCantPerson(int cantPerson) {
		CantPerson = cantPerson;
	}

	private void Order(ArrayList<Person> Persons) {
		Collections.sort(Persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return new String(p1.getLastName()).compareTo(p2.getLastName());
			}
		});
	}

	public boolean verify(Person P1) {
		boolean check = true;
		for (int i = 0; i < Persons.size(); i++) {
			if (Persons.get(i).getID().equals(P1.getID())) {
				check = false;
			}
		}
		return check;
	}
	
	public Person getPerson(int i){
		return Persons.get(i);
	}
}