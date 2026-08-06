public class MinimumElement {
    public static void main(String[] args) {

        int[] numbers = { 12, 45, 2, 98, 33, 67, 18 };

        if (numbers.length == 0) {
            System.out.println("no elements present in array");
            return;
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        System.out.println(min);
        System.out.println(max);

    }
}
