public class ShiftZeros {
    public static void main(String[] args) {
        int[] numbers = { 1, 0, 2, 0, 5, 0, 7 };
        shiftZeros(numbers);
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void shiftZeros(int[] numbers) {
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                numbers[j] = numbers[i];
                j++;
            }
        }

        while (j < numbers.length) {
            numbers[j] = 0;
            j++;
        }

    }
}
