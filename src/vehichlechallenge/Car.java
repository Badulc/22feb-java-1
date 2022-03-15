package vehichlechallenge;

public class Car extends Vehichle {


	private int passengers;
	private int doors;
	
	public Car(String brand, String model, int seats,int doors,int passengers) {
		
		super();
		this.doors = doors;
		this.passengers = passengers;
		this.setBrand("ford");
		this.setModel("focus");
		this.setSeats(4);
//		this.doors = 4;
//		this.passengers = 4;
		
		
//		super(brand, model, seats);
//		// TODO Auto-generated constructor stub
	}

//	public Car(int passengers, int doors) {
//		super();
//		this.passengers = passengers;
//		this.doors = doors;
//	}
	
}
