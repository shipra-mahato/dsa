public class SecondLargestElement {

    public static void main(String[] args) {
        int[] numbers = { 12, 45, 2, 98, 33, 67, 18 };
        //int[] numbers = {98, 98, 67};

        if(numbers.length < 2){
            System.out.println("Not sufficient elements in array");
            return;
        }
        System.out.println(findSecondLargestElement(numbers));
    }

    public static int findSecondLargestElement(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] == largest || numbers[i] == secondLargest)
                continue;
            else if(numbers[i] > largest){
                secondLargest = largest;                
                largest = numbers[i];            
            }  else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
             }  else if (largest == secondLargest){
                secondLargest = numbers[i];
             }
           
        }

        return secondLargest;

    }

}
