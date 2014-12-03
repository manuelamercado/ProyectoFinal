package EmploymentMarket01;


public class CompanyApplication {
	
	private enum WorkingDay{Fijo,Temporal,Parcial};
	private int EmployeeCant;
	private String WorkPosition;
	private String Area;
	private boolean Satisfied;
	
	
	public CompanyApplication(int employeeCant, String workPosition,
			String area) {
		super();
		EmployeeCant = employeeCant;
		WorkPosition = workPosition;
		Area = area;
		Satisfied = false;
	}
	
	public int getEmployeeCant() {
		return EmployeeCant;
	}
	public void setEmployeeCant(int employeeCant) {
		EmployeeCant = employeeCant;
	}
	public String getWorkPosition() {
		return WorkPosition;
	}
	public void setWorkPosition(String workPosition) {
		WorkPosition = workPosition;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}

	public boolean isSatisfied() {
		return Satisfied;
	}

	public void setSatisfied(boolean satisfied) {
		Satisfied = satisfied;
	}

	public Company getCompany() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
