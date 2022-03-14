package inheritance;

public class Animal {
	
	private int age;
	private int numOflegs;
	private String colours;
	
	
	public Animal(int age, int numOflegs, String colous) {
		super();
		this.age = age;
		this.numOflegs = numOflegs;
		this.colours = colous;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNumOflegs() {
		return numOflegs;
	}


	public void setNumOflegs(int numOflegs) {
		this.numOflegs = numOflegs;
	}


	public String getColous() {
		return colours;
	}


	public void setColous(String colous) {
		this.colours = colous;
	}


	@Override
	public String toString() {
		return "Animal [age=" + age + ", numOflegs=" + numOflegs + ", colours=" + colours + "]";
	}
	
	//public Addtolist(Anim);
	

}
