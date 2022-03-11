package operators;

public class Results {
	 
	 public String name;
	 public int Physics;	// = 110;
	 public int Chemistry;	// = 100;
	 public int Biology;	// = 125;
	 public int total;		// = Biology+Chemistry+Physics;
	 public double percentage;	// = (total * 100) / 450;

	 
	 public Results(String name,int Physics,int Chemistry, int Biology) {
		 this.name = name;
		 this.Physics = Physics;
		 this.Chemistry = Chemistry;
		 this.Biology = Biology;
		 this.total = Physics+Chemistry+Biology; 
	 }
	 
	 public void methodOne() {
		 System.out.println(this.name);
		 System.out.println("Physics Grade:" + this.Physics+"/150");
		 System.out.println("Chemistry Grade:" + this.Chemistry+"/150");
		 System.out.println("Biology Grade:" + this.Biology+"/150");
		 System.out.println(this.name + "total is:" + this.total+"/450");
	 }
	 
	 public void methodTwo() {
		this.percentage = (total * 100) / 450;
		System.out.println("percent: " + this.percentage + " %");
	 }
}
