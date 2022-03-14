package person;

public class Person {
	
	public String name;
	public int age;
	public int shoeSize;
	
	public Person() {}
	
	public Person (String name, int age, int shoeSize) {
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
	}

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

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}
	
	

//	public Person(Person badul, int i, int j) {
//		// TODO Auto-generated constructor stub
//	}
	

	
	
}
