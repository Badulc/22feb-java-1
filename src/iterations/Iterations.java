package iterations;

public class Iterations {

	public static void main(String[] args) {
			
        int catCount = 0;
        boolean notEnoughCats = true;

        while(notEnoughCats) {
            System.out.println(catCount);
            catCount++;

            if(catCount > 100) {
                notEnoughCats = false;
            }
        }

        System.out.println("Too many cats what do I do");
    }
}



