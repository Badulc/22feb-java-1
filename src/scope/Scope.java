package scope;

public class Scope {
	
	public String message = "hello-class scope";
	
	public void methodOne() {
		String message = "goodbye-this is method one";
		System.out.println(message);
		
	}

	public void methodTwo() {
		System.out.println(message);
	}
	
	public void methodTwo(String message) {
		System.out.println(message);
	}
}
