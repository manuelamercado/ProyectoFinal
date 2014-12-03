package InterfazGrafica;

import EmploymentMarket01.Academic;
import EmploymentMarket01.CollectionPerson;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionPerson personRegister= CollectionPerson.getInstanceCollectionPerson();
		Academic person = new Academic();
		person.setAcademicLevel("Universitary");
		person.setName("Prueba");
		person.setLastName("Funciona");
		person.setID("402-2380522-1");
		personRegister.setPersons(person);
		System.out.println(personRegister.getPersons().get(0).getName());
	}

}
