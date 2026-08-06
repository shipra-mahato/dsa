public class PrintArray {

    public static void main(String[] args) {
        int[] numbers = { 12, 45, 2, 98, 33, 67, 18 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("********************************");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}