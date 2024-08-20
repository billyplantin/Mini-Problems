/*
Billy Plantin
Change calculates change due in a transaction while returning least amount of bills/coins due.
3 test cases used.
 */
public class Change {

    /*
        least change method returns  change due to customer in least amount of bills/coins
     */
    public void leastChange(double total, double paid){

        System.out.println("Total amount due: $" + total);
        System.out.println("Amount Paid: $" + paid);
        double change = paid - total;

        if (change < 0){
            System.out.println("Remaining is $" + Math.abs(change));
            return;
        }
        change = Math.round(change * 100.0)/100.0;
        System.out.println("Change due: S" + change + "\n" );

        //dollars
        int ones = 0, fives = 0, tens = 0;
        int twenties = 0, fifties = 0, hundreds = 0;

        //change
        double pens = 0, nicks = 0, dimes = 0, quarts = 0;

        //while change is still owed
        while (change != 0.0) {
            //if change owed is greater than 100, get number of hundreds, update change due
            if (change >= 100){
                hundreds = (int) (change / 100);
                change = round(change % 100);
            }

            //if change owed is greater than 50, get number of fifties, update change due
            else if (change >= 50) {
                fifties = (int) (change / 50);
                change = round(change % 50);
            }

            else if (change >= 20) {
                twenties = (int) (change / 20);
                change = round(change % 20);
            }

            else if (change >= 10) {
                tens = (int) (change / 10);
                change = round(change % 10);
            }
            else if (change >= 5) {
                fives = (int) (change / 5);
                change = round(change % 5);
            }
            else if (change >= 1){
                ones = (int) (change / 1);
                change = round(change % 1);
            }
                else if (change >= 0.25){
                    quarts = (int) (change / 0.25);
                    change = round(change % 0.25);
                }
                else if (change >= 0.10) {
                    dimes = (int) (change / 0.10);
                    change = round(change % 0.10);
                } else if (change >= 0.05) {
                    nicks = (int) (change / 0.05);
                    change = round(change % 0.05);
                } else if (change >= 0.01) {
                    pens = (int) (change / 0.01);
                    change = round(change % 0.01);
                }
                else break;


        }
        System.out.println(" "+ hundreds + " Hundreds\n " +  fifties + " Fifties\n " +  twenties + " Twenties\n " +  tens + " Tens\n "
                +  fives + " Fives\n " + ones + " Ones\n " + quarts + " Quarters\n " + dimes + " Dimes\n " + nicks + " Nickels\n " + pens + " Pennies\n-------");

    }

    // Helper method to round to 2 decimal places
    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main (String[] args){

        Change test = new Change();

        test.leastChange(37.64,50);

        test.leastChange(517.33,550);

        test.leastChange(0,20);

    }
}
