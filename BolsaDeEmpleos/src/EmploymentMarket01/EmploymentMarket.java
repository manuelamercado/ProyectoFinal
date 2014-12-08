package EmploymentMarket01;

import java.util.ArrayList;

public class EmploymentMarket {

private ArrayList<CompanyPerson> EndCP;
private static EmploymentMarket employmentMarket;



public EmploymentMarket(ArrayList<CompanyPerson> endCP){
this.EndCP=endCP;
}

private EmploymentMarket(){
EndCP= new ArrayList<CompanyPerson>();
}


public static EmploymentMarket getInstanceEmploymentMarket(){
if(employmentMarket==null)
employmentMarket = new EmploymentMarket();
return employmentMarket;
}

public void compare(CompanyApplication CApplication){
 for(int i=0; i<CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplicantions().size()||CApplication.getEmployeeCant()==0; i++){
 if(CApplication.getArea().equals(CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getArea())){
 CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson().setDuty(true);
CompanyPerson CP = new CompanyPerson(CApplication.getCompany(),CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson(),CApplication.getWorkPosition(),CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getArea());
Satisfied.getInstanceSatisfied().setSatisfiedEmployes(CP);
 Satisfied.getInstanceSatisfied().setSatisfiedPerson(CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i));
 CollectionPersonApplicant.getInstanceCollectionPersonApplicant().Clean( CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson(),CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplicantions());
EndCP.add(CP);
}
}

if(CApplication.getEmployeeCant()==0)
Satisfied.getInstanceSatisfied().setSatisfiedCompany(CApplication);
}
}