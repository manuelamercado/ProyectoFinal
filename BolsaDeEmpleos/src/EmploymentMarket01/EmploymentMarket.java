package EmploymentMarket01;

import java.util.ArrayList;

public class EmploymentMarket {
	
	private Satisfied Satisfied;	
	
	
	public void compare(CompanyApplication CApplication, CollectionPersonApplicant CPApplication, ArrayList<CompanyPerson> EndCP){
		while(CApplication.getEmployeeCant()!=0){
			for(int i=0; i<CPApplication.getPersonApplicantions().size(); i++){
				if(CApplication.getArea().equals(CPApplication.getPersonApplicantions().get(i).getArea())){
					CPApplication.getPersonApplicantions().get(i).getPerson().setDuty(true);
					CompanyPerson CP = new CompanyPerson(CApplication.getCompany(),CPApplication.getPersonApplicantions().get(i).getPerson());
					Satisfied.setSatisfiedEmployes(CP);
					Satisfied.setSatisfiedPerson(CPApplication.getPersonApplicantions().get(i));
					CPApplication.Clean(CPApplication.getPersonApplicantions().get(i).getPerson(), CPApplication.getPersonApplicantions());
					EndCP.add(CP);
				}
			}
		}
		Satisfied.setSatisfiedCompany(CApplication);
	}
}