public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = { 12, 45, 2, 98, 33, 67, 18 };

        if (numbers.length == 0) {
            System.out.println("no elements present in array");
            return;
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number)
                max = number;
        }

        System.out.println(max);

    }
}
