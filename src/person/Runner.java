package person;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		Person badul = new Person();
//			System.out.println(badul.name);
//			System.out.println(badul.age);
//			System.out.println(badul.shoeSize);
		badul.setName("badul");
		badul.setAge(31);
		badul.setShoeSize(10);
		List <Person> pList = new ArrayList<>();
		pList.add(badul);
			System.out.println(pList);
//			System.out.println();
			
			
			
//		Person john = new Person("john", 20, 7);
//			System.out.println(john.name);
//			System.out.println(john.age);
//			System.out.println(john.shoeSize);
//			
//			System.out.println();
//			
//		Person bob = new Person("bob", 25, 11);
////			System.out.println("name:" + bob.name);
////			System.out.println("age:" + bob.age);
////			System.out.println("shoe size:" + bob.shoeSize);
//		System.out.println(bob.getName());
//		bob.getAge();
//		bob.getShoeSize();
//		
//		
	}
	
	

}
