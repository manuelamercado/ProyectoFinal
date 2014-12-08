package EmploymentMarket01;

import java.util.ArrayList;
public class PersonApplication {
	
	
	private String Area;
	private ArrayList<String> WorkPosition;
	private boolean Satisfied;
	private Person Person;
	private String title;
	private String Contract;
	private String namePer;
	private String MobilePer;
	private String emailPer;
	private String companyLab;
	private String posLab;
	private String nameLab;
	private String MobileLab;
	
	public PersonApplication(String area, ArrayList<String> workPosition,
			boolean satisfied, EmploymentMarket01.Person person) {
		super();
		Area = area;
		WorkPosition = workPosition;
		Satisfied = satisfied;
		Person = person;
	}
	public PersonApplication(Person p) {

		Area = null;
		WorkPosition = new ArrayList<String>();
		Satisfied = false;
		Person = p;
		title=null;
		Contract=null;
		namePer=null;
		MobilePer=null;
		emailPer=null;
		companyLab=null;
		posLab=null;
		nameLab=null;
		MobileLab=null;
	}	
	public ArrayList<String> getWorkPosition() {
		return WorkPosition;
	}
	public String getNamePer() {
		return namePer;
	}

	public void setNamePer(String namePer) {
		this.namePer = namePer;
	}

	public String getMobilePer() {
		return MobilePer;
	}

	public void setMobilePer(String mobilePer) {
		MobilePer = mobilePer;
	}

	public String getEmailPer() {
		return emailPer;
	}

	public void setEmailPer(String emailPer) {
		this.emailPer = emailPer;
	}

	public String getCompanyLab() {
		return companyLab;
	}

	public void setCompanyLab(String companyLab) {
		this.companyLab = companyLab;
	}

	public String getPosLab() {
		return posLab;
	}

	public void setPosLab(String posLab) {
		this.posLab = posLab;
	}

	public String getNameLab() {
		return nameLab;
	}

	public void setNameLab(String nameLab) {
		this.nameLab = nameLab;
	}

	public String getMobileLab() {
		return MobileLab;
	}

	public void setMobileLab(String mobileLab) {
		MobileLab = mobileLab;
	}

	public void setWorkPosition(ArrayList<String> workPosition) {
		WorkPosition = workPosition;
	}
	public void setWorkPosition(String workPosition) {
		WorkPosition.add(workPosition);
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
	public Person getPerson() {
		return Person;
	}
	public void setPerson(Person person) {
		Person = person;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContract() {
		return Contract;
	}

	public void setContract(String contract) {
		Contract = contract;
	}
}