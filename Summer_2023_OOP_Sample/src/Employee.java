public class Employee {
	
	int id = 0;
    String name = "";
    String title ="";
    Integer age = 0;
    
    public String getName() {
    	System.out.println(name);
        return name;
    }
    
    public String setName(String name) {
        return this.name = name;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String setTitle(String title) {
        return this.title = title;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public Integer setAge(Integer age) {
        return this.age = age;
    }
    
    public int getid() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
}
