public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 2, 98, 33 };
        reverseArray(numbers);
        for(int number : numbers){
            System.out.println(number);
        }
    }

    public static void reverseArray(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;

        }

    }

}
