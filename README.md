# Change.java by Billy Plantin #

The Change class is designed to calculate and return the least amount of bills and coins required for making change. 
It provides a method to determine how much change is due and how it should be broken down into the smallest number of bills and coins.

Method: leastChange(double total, double paid)
  Purpose: Calculates the change due to a customer and returns it using the least number of bills and coins.

  Parameters:
    total: The total amount due.
    paid: The amount paid by the customer.

Behavior:

  Prints the total amount due and the amount paid.
  Calculates the change as the difference between paid and total.
  Checks if the paid amount is less than the total and prints the remaining amount if so.
  Rounds the change to 2 decimal places to avoid precision issues.
  Breaks down the change into the least number of bills and coins:
  Bills: Hundreds, Fifties, Twenties, Tens, Fives, Ones. 
  Coins: Quarters, Dimes, Nickels, Pennies.
  Prints the quantity of each type of bill and coin used for the change.
  
  Helper Method: round(double value)

Purpose: Rounds the given value to 2 decimal places to prevent floating-point precision issues.

Example Usage:
test.leastChange(37.64, 50);
  Output: The change due is broken down into the fewest number of bills and coins.

test.leastChange(517.33, 550);
  Output: Provides the breakdown of change for the given total and amount paid.

test.leastChange(0, 20);
  Output: Shows how to handle a scenario where no change is required (i.e., the total is zero).

--------------------------------------

# CollatzConjecture.java 

This Java program implements the Collatz Conjecture, a mathematical sequence where you start with any positive integer greater than 1 and follow these rules to eventually reach the number 1:

If the number is even, divide it by 2.
If the number is odd, multiply it by 3 and add 1.

The program calculates and prints the number of steps it takes to reach 1 based on the above rules.

Program Details:

  User Input:
    The program prompts the user to enter a number greater than 1.

Processing:
  
  The program initializes a counter variable steps to keep track of the number of steps taken.
It then uses a while loop to repeatedly apply the Collatz rules to the input number until it reaches 1.
For each iteration, it updates the number according to whether it is even or odd and increments the step counter.
Output:

Once the loop terminates (when the number reaches 1), the program prints the total number of steps taken to reach 1.


------------------------------------------

# TwoSum.java 

The TwoSum class provides a method to find two indices in an array of integers such that the sum of the elements at these indices equals a given target value. It uses a brute-force approach with nested loops to achieve this.

Method: twoSum(int[] numbers, int target)

Purpose: Finds two indices in the array whose corresponding elements sum up to the specified target value.
Parameters:
  numbers: An array of integers.
  target: The target sum for which two elements' indices need to be found.
Returns:
  An array of two integers representing the indices of the elements that add up to the target. If no such elements are found, it prints a message and returns null.
