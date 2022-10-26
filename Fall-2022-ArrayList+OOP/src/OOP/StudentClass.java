package OOP;

public class StudentClass {
	
	//attributes
	String name = "";
	int age = 0;
	int stuNo = 0;
	int study = 0;
	String activity = "";
	
	public int getStudy() {
		return study;
	}
	public void setStudy(int study) {
		if(this.study == 1) {
			studying();
		} else {
			notStudy();
		};
	}
	//getter and setters for attributes - encapsulation
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
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	
	//behaviors
	public void studying() {
		
		activity = "Yes, I am pretending to study";
		
	}
	
	public void notStudy() {
		
		activity = "No, I'm chillin'. Leave me alone.";
		
	}

}
