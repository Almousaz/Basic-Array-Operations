import java.util.Arrays;

public class FindLargest {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));

        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (largestNumber < numbers[i]) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("largest number : " + largestNumber);


        int[] ages = {14, 18, 24, 56, 11};

        int largestAges = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (largestAges < ages[i]) {
                largestAges = ages[i];
            }
        }
        System.out.println("largest age : " + largestAges);





    }
}
