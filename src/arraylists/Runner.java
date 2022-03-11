package arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		List <String> pplNames = new ArrayList<>();		//create and initialise a new empty list
		
		pplNames.add("bob");
		pplNames.add("john");
		pplNames.add("badul");
		pplNames.add("test name 3");		//adding elements to the list
		pplNames.add("test name 2");
		pplNames.add("test name");
		
		System.out.println(pplNames);		// print all names in the list
		
		System.out.println(pplNames.get(5));	// get element from list by index
		
		pplNames.set(0, "6th name here");
		System.out.println(pplNames.get(0));
		System.out.println(pplNames);
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= sc.nextLine();				//taking input and inserting into arraylist
		System.out.println(str);
		pplNames.add(str);
		System.out.println(pplNames);
		
		
		

	}

}
