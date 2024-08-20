/*
The Collatz Conjecture – ask the user for a number greater than 1.
Find the number of steps it takes to reach 1 by the following rules:
if the number is even, divide it by 2.
If it is odd, multiply it by 3, then add 1.
Print the number of steps.
 */

import java.util.Scanner;
public class CollatzConjecture {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 1: ");

        int input = scanner.nextInt();
        System.out.println("Ok, your number is  " + input);

        //counting steps to reach 1
        int steps = 0;

        int number = input;

        //while the number that was input does not equal 1
        while (number != 1){

            //if number is even, divide it by 2
            if(number % 2 == 0){
                number = number / 2;
            // else, multiply it by 3 then add 1
            } else{
                number = (number * 3) + 1;
            }
            steps++;
        }

        System.out.println("It took " + steps + " steps to reach 1");



    }
}
