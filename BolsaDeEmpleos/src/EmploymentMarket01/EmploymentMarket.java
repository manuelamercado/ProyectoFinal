package EmploymentMarket01;

public class EmploymentMarket {
	
	private Satisfied Satisfied;
	private CollectionPerson Person; 
	
	
	
	public void compare(CompanyApplication CApplication, CollectionPersonApplicant CPApplication){
		while(CApplication.getEmployeeCant()!=0){
			for(int i=0; i<CPApplication.getPersonApplicantions().size(); i++){
				if(CApplication.getArea().equals(CPApplication.getPersonApplicantions().get(i).getArea())){
					CompanyPerson CP = new CompanyPerson(CApplication.getCompany(),CPApplication.getPersonApplicantions().get(i).getPerson());
					Satisfied.setSatisfiedEmployes(CP);
					Satisfied.setSatisfiedPerson(CPApplication.getPersonApplicantions().get(i));
					CPApplication.Clean(CPApplication.getPersonApplicantions().get(i).getPerson(), CPApplication.getPersonApplicantions());
				}
			}
		}
		Satisfied.setSatisfiedCompany(CApplication);
	}
}
