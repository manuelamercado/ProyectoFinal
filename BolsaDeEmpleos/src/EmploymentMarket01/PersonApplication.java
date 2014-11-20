package EmploymentMarket01;

import java.util.ArrayList;

public class PersonApplication {
	
	
	public enum Grade {};
	public CompanyType Area;
	private ArrayList<String> WorkPosition;
	
	public ArrayList<String> getWorkPosition() {
		return WorkPosition;
	}
	public void setWorkPosition(ArrayList<String> workPosition) {
		WorkPosition = workPosition;
	}

}
