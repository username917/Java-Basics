package Patients;

public class Patient {
	
	private String name ="";
	private int age=0;
	private String healthCard = "";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHealthCard() {
		return healthCard;
	}
	public void setHealthCard(String healthCard) {
		this.healthCard = healthCard;
	}
	public int getInsuranceNo() {
		return insuranceNo;
	}
	public void setInsuranceNo(int insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	private int insuranceNo=0;
	private String condition="";

}
