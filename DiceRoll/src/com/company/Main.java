package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Integer die = null;
        System.out.print("How many die are you rolling dawg?: ");
        try{
            die = input.nextInt();
        }
        catch ( InputMismatchException exception) {
            System.out.println("Please input a valid number, thank you!");
            main(null);
        }
        int[] x = dieGen(die);
        System.out.println("Your dice rolls are: ");
        for(int i = 0; i<x.length; i++){
            System.out.println(x[i]);
        }
        System.out.println("The sum of your dice was..." + diceSum(x));
        endGame();
    }

    public static void endGame(){
        Scanner input = new Scanner(System.in);
        String choice = null;
        System.out.print("Do you want to play again, Y:N: ");
        try {
            choice = input.nextLine();
        }
        catch (InputMismatchException exception) {
            System.out.println("Please put a valid answer, thank you!");
            endGame();
        }
        if (choice.toUpperCase().equals("Y")){
            main(null);
        }
        else if (choice.toUpperCase().equals("N")){
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        else {
            System.out.println("Please put a valid answer, thank you!");
        }
    }

    public static int[] dieGen(int number){
        int[] dice;
        dice = new int[number];
        Random rand = new Random();
        for(int i = 0; i < number; i++){
            int x = rand.nextInt((6-1)+1) + 1;
            dice[i] = x;
        }
        return dice;
    }

    public static int diceSum(int[] array){
        int x = 0;
        for(int i = 0; i<array.length; i++){
           x += array[i];
        }
        return x;
    }
}
