public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target)
                continue;

            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] + numbers[i] == target) {
                    firstNum = numbers[i];
                    secondNum = numbers[j];
                    break;
                }
            }
            if(firstNum != Integer.MIN_VALUE)
                break;
        }

        System.out.println(firstNum);
        System.out.println(secondNum);
    }

}
