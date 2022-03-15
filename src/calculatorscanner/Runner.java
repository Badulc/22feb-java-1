package calculatorscanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int numOne;
		//int numTwo;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (flag) {
			System.out.println("enter a number");
			//store input in variable named below numOne
			Integer numOne = sc.nextInt();
			
			// ask user for 2nd input 
			System.out.println("enter 2nd value");
			//store value in variable numtwo
			Integer numTwo = sc.nextInt();
			//print out the value of both variables added together
			System.out.println(numOne+numTwo);
		}
	}

}
