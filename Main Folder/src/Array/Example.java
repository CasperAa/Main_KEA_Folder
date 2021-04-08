package Array;

public class Example {
    public static void main(String[] args) {
// Count how many values in array is above value 5
        int[] someNumbers= {1,3,6,7,10,1,25};
        System.out.println(valueOver5(someNumbers,5));

    }

        public static int valueOver5 (int [] numbers, int number){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > number) {
                sum++;
            }
        }
        return sum;
        }
}
