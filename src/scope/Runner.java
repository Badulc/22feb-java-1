package scope;

public class Runner {
	
	public static void main(String[] args) {
		
		Scope myObj = new Scope();
		myObj.methodOne();
		myObj.methodTwo();
		myObj.methodTwo("method two message");
		
	}

}
