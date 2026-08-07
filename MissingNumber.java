public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5, 6 };

        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            arrSum = arrSum + numbers[i];
        }

        return totalSum - arrSum;
    }

    /*
     * private static int findMissingNumber(int[] numbers) {
     * for(int i=0; i< numbers.length-1;i++){
     * if(numbers[i+1] != (numbers[i]+1)){
     * return numbers[i]+1;
     * }
     * }
     * return 0;
     * }
     */
}
