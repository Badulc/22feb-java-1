package personchallenge;

public class Person {
	
	String name ="ksnj";
	String jobTt = "jsnj";
	int age = 10;
	
	Person(String name, String jobTt, int age) {
		this.name = name;
		this.jobTt = jobTt;
		this.age = age;
	}



	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getJobTt() {
		return jobTt;
	}





	public void setJobTt(String jobTt) {
		this.jobTt = jobTt;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	Person p = new Person(name,jobTt,age);
	
	

}
