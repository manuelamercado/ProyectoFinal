package EmploymentMarket01;


public class CompanyApplication {
	
	public enum WorkingDay{Fijo,Temporal,Parcial};
	public int EmployeeCant;
	public String WorkPosition;
	public String Area;
	public GradeLevel Level;
	public boolean Satisfied;
	
	
	public CompanyApplication(int employeeCant, String workPosition,
			String area, GradeLevel level) {
		super();
		EmployeeCant = employeeCant;
		WorkPosition = workPosition;
		Area = area;
		Level = level;
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
	public GradeLevel getLevel() {
		return Level;
	}
	public void setLevel(GradeLevel level) {
		this.Level = level;
	}

	public boolean isSatisfied() {
		return Satisfied;
	}

	public void setSatisfied(boolean satisfied) {
		Satisfied = satisfied;
	}
	
	
}

