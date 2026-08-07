public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 2, 2, 3, 4, 4, 5 };

        int uniqueCount = removeDuplicates(numbers);
        for (int i = 0; i < uniqueCount+1; i++) {
            System.out.println(numbers[i]);
        }
    }

    static int removeDuplicates(int[] numbers) {
        int temp = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[temp]) {
                temp++;
                numbers[temp] = numbers[i];
            }
        }
        return temp;
    }
}
