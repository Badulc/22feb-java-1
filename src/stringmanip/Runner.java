package stringmanip;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tday = new String("today it is sunny");
		String yday = new String("yesterday it was raining");
		String bothDays = new String();

			System.out.println(tday+", "+yday);
		bothDays = tday+", "+yday;
			System.out.println(bothDays);
			System.out.println(bothDays.toUpperCase());
		//		System.out.println();

		String mySubString1 = tday.substring(0, 11);
			System.out.println(mySubString1);
		String mySubString2 = yday.substring(16, 24);
			System.out.println(mySubString2);
			System.out.println(mySubString1 + mySubString2);

		String[] words = bothDays.split("\\s+");
			System.out.println("Word Count: "+words.length);
			System.out.println(Arrays.toString(words));
			
			
			//seprate methods into classes... nned to work on

	}

}
