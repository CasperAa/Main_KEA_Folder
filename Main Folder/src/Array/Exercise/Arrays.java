package Array.Exercise;

public class Arrays {
    public static void main(String[] args) {
    //int[] testArray = {1,2,3};
        //System.out.println(sumThreeNumbers(testArray));

        int[] sumOfArray = {10,20,30,40,50,60,70};
        System.out.println(sumNumbersFromArray(sumOfArray));
    }
    /*
    //I can assume that the array has three integers
        public static int sumThreeNumbers(int[] numbers){
            return numbers[0] + numbers[1] + numbers[2];
    }
    */
        public static int sumNumbersFromArray(int [] numbers){
            //An array has a length numbers.length
            int sum = 0;
            for (int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }
            return sum;
    }
}
