package EmploymentMarket01;


public class CompanyApplication {
	
	private int EmployeeCant;
	private String WorkPosition;
	private String Area;
	private boolean Satisfied;
	private String RNC;
	private String AcademicLevel;
	private String title;
	private int expYear;
	private String contract;
	private String department;
	private String contactName;
	private String contactMovil;
	private String contactPos;
	private Company Cmp;
	
	public CompanyApplication(int employeeCant, String workPosition,
			String area,Company cmp) {
		super();
		EmployeeCant = employeeCant;
		WorkPosition = workPosition;
		Area = area;
		Satisfied = false;
		Cmp= cmp;
	}
	
	public CompanyApplication() {
		EmployeeCant =0;
		WorkPosition = "";
		Area = "";
		Satisfied = false;
		RNC="";
		AcademicLevel="";
		title="";
		expYear=0;
		contract="";
		department="";
		contactName="";
		contactMovil="";
		contactPos="";
		Cmp= new Company();
	}
	public String getRNC() {
		return RNC;
	}

	public void setRNC(String rNC) {
		RNC = rNC;
	}

	public String getAcademicLevel() {
		return AcademicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		AcademicLevel = academicLevel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactMovil() {
		return contactMovil;
	}

	public void setContactMovil(String contactMovil) {
		this.contactMovil = contactMovil;
	}

	public String getContactPos() {
		return contactPos;
	}

	public void setContactPos(String contactPos) {
		this.contactPos = contactPos;
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


	public void setCompany(Company company) {
		this.Cmp = company;
	}
	public void setCompany(String RNC) {
		Company temp= new Company();
		for(int i=0; i<CollectionCompany.getInstanceCollectionCompany().getCantCompany();i++){
			if(!CollectionCompany.getInstanceCollectionCompany().getCompanies().get(i).getRNC().equalsIgnoreCase(RNC)){
				temp=CollectionCompany.getInstanceCollectionCompany().getCompanies().get(i);
				setCompany(temp);
			}
		}
		
	}
	
	public Company getCompany() {
		return Cmp;
	}	
	
}