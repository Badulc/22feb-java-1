package scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		boolean flag = true;
		//while flag is true
		while (flag) {
			
			//ask user for input
			System.out.println("enter a number");
			//store input in variable named below numOne
			Integer numOne = sc2.nextInt();
			
			// ask user for 2nd input 
			System.out.println("enter 2nd value");
			//store value in variable numtwo
			Integer numTwo = sc2.nextInt();
			//print out the value of both variables added together
			System.out.println(numOne+numTwo);
			
			System.out.println("continue?");
			sc2.nextLine();
			String choice = sc2.nextLine();
			
			
			
			if (choice.equalsIgnoreCase("y")) {
				continue;
			}
			else if (choice.equalsIgnoreCase("n")) {
				System.out.println("stopping");
				flag = false;
				continue;
			} else {
				System.out.println("invalid entry");
			}
			
		}
		
//		Integer numOne =
		
		
		// TODO Auto-generated method stub
		// sc is the name of the scanner method or object 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a num: ");
//		Integer numberOne = sc.nextInt();
//		
//		sc.nextLine(); //consume the leftover next line character that occurs from pressing enter
//		
//		System.out.println("enter another value");
//		
//		String text = sc.nextLine();
//		
//		System.out.println("value 1 is:"+numberOne);
//		System.out.println("value 2 is: "+text);
		
//		System.out.println("enter 2nd num: ");
//		
//		Integer numberTwo = sc.nextInt();
//		
//		System.out.println(numberOne+numberTwo);
		
		//need to close scanner resource using name used to create scanner
		sc2.close();
		

	}

}
