package operators;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	public double div(double a, double b) {
		if (a>b) {
			
//			return a/b;
			System.out.println("undivisble");
			
		}
		
		else {
			return  a/b;
		} 
//		return a/b;
		return 0;
	}
	
}
