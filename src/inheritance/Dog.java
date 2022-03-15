package inheritance;

public class Dog extends Animal {
	

	private String breed;
	private boolean isPanting;
	

	public Dog(int age, int numOflegs, String colours,String breed,boolean isPanting) {
		//can call variables using this
		super(age, numOflegs, colours);
		// 
		this.setAge(3);
		this.setNumOflegs(4);
		this.setColous("brown");
		this.breed = ("bulldog");
		this.isPanting = true;
	}


	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", isPanting=" + isPanting + ", Age=" + getAge() + ", NumOflegs="
				+ getNumOflegs() + ", c=" + getColous()+" " +"breed=" + " "+ breed+"panting"+ " "+isPanting + "]";
	}
	
	
	
//	public addtoList ();
}
