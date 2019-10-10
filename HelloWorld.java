import java.util.Random;
import java.util.Scanner;



public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of die you wish to roll: ");
		int x = input.nextInt();
		int [] die = diceGetter(x);
		for(int i = 0; i < die.length; i++) {
			if (i == 0) {
				System.out.println("Your dice rolled: " + die[i]);
			}
			else {
				System.out.println("And "+ (i + 1) + " rolled " + "__ " + die[i] + " __");
			}
		}
		System.out.println("The sum of your roll is: " + sumGetter(die));
		System.out.println("Thanks for playing!");
		check();
	}
	
	public static void check() {
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to go again Y:N?: " );
	    String x = input.next();
		if (x.toUpperCase().equals("Y")){
			main(null);
		} 
		
		else if(x.toUpperCase().equals("N")) {
			System.out.print("Thanks for playing!");
			System.exit(0);
		}
		
		else {
			System.out.println("Please input a valid answer. ");
			check();
		}
	}
	
	public static int sumGetter(int[] die){
		int sum = 0;
		for(int i = 0; i <die.length; i++) {
			sum += die[i];
		}
		return sum;
	}
	
	public static int[] diceGetter(int number){
		int die[];
		Random rand = new Random();
		int High = 6;
		int Low = 1;
		die = new int[number];
		for(int i = 0; i <= number - 1; i++) {
			int x = rand.nextInt(High-Low) + Low;
			die[i] = x;
		}
		return die;
	}
	
		
	

}
