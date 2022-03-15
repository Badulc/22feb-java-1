package vehichlechallenge;

public class Vehichle {

	private String brand;
	private String model;
	private int seats;
	
	
//	public Vehichle (String brand,String model,int seats, int i, int j, int k) {
	
		
		this.brand= brand;
		this.model = model;
		this.seats = seats;
	}


	public Vehichle() {
		// TODO Auto-generated constructor stub
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	@Override
	public String toString() {
		return "Vehichle [brand=" + brand + ", model=" + model + ", seats=" + seats + ", Brand" + getBrand()
				+ ", Model=" + getModel() + ", Seats=" + getSeats() + "]";
	}
	
	
	
	
}
