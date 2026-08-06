import java.util.ArrayList;

public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = { 12, 45, 2, 98, 33, 67, 18 };

        int sum = 0;
        double average = 0.00;
        int evenCount = 0;
        int oddCount = 0;
        int target = 33;
        ArrayList<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (numbers[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;

            if (numbers[i] == target) {
                indexList.add(i);
            }
        }

        average = (double)sum / numbers.length;

        System.out.println("Sum of all the elements: " + sum);
        System.out.println("Average of all the elements: " + average);
        System.out.println("Even Count of all the elements: " + evenCount);
        System.out.println("Odd Count of all the elements: " + oddCount);
        if (!indexList.isEmpty())
            System.out.println("Element found at index: " + indexList);
        else
            System.out.println("Element not found");
    }
}
