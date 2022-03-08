package com.qa.helloworld;

public class HelloWorld {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	public void helloworld() {
		String helloWorld = "Hello World\nThis is more text";
		System.out.println(helloWorld);
		
	}
	
	public void printMessage(String messageOne, String messageTwo, int number) {
		System.out.println(messageOne);
		System.out.println(messageTwo);
		System.out.println(number);
		
	}
	
	public String concatText (String x, String y) {
		return x + " " + y;
	}
}
