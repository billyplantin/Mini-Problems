
public class TwoSum {


    public int[] twoSum (int numbers[], int target) {
        int length = numbers.length;
        int i, num1, num2;

        //loop through array elements
        for (i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    // Return the indices of the two elements
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("target not reached");
        return null;
    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        TwoSum test = new TwoSum();

        int result [] = test.twoSum(numbers,6);

        System.out.println("Indices: " + result[0] + ", " + result[1]);







    }
}