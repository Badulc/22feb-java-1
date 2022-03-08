package com.qa.helloworld;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld myObj = new HelloWorld();
		
		myObj.helloworld();
		myObj.printMessage("Hello World", "This is more text", 10);
		
		String myResult = myObj.concatText("Hello", "World");
		System.out.println(myObj);
	}

}
