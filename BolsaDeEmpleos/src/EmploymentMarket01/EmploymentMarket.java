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
public void compare(CompanyApplication CA){
if(CA.getEmployeeCant() == 0) return;
for(int i=0; i < CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplicantions().size(); i++){
if(CA.getArea().equals(CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getArea())){
CompanyPerson CP = new CompanyPerson(CA.getCompany(),CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson(),CA.getWorkPosition(),CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getArea());
Satisfied.getInstanceSatisfied().setSatisfiedEmployes(CP);
Satisfied.getInstanceSatisfied().setSatisfiedPerson(CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i));
CollectionPersonApplicant.getInstanceCollectionPersonApplicant().Clean( CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson(),CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplicantions());
CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson().setDuty(true);
EndCP.add(CP);
Satisfied.getInstanceSatisfied().setPendingPersonApplication();
Satisfied.getInstanceSatisfied().setPendingCompanyApplication();
}
}
if(CA.getEmployeeCant()==0)
Satisfied.getInstanceSatisfied().setSatisfiedCompany(CA);
}
}
