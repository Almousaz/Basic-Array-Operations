import java.util.Arrays;

public class FindLargest {
    public static void main(String[] args) {


//        int[] numbers = {10, 20, 30, 40, 50};
//        System.out.println(Arrays.toString(numbers));
//
//        int largestNumber = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (largestNumber < numbers[i]) {
//                largestNumber = numbers[i];
//            }
//        }
//        System.out.println("largest number : " + largestNumber);
//
//
//        int[] ages = {14, 18, 24, 56, 11};
//
//        int largestAges = ages[0];
//        for (int i = 1; i < ages.length; i++) {
//            if (largestAges < ages[i]) {
//                largestAges = ages[i];
//            }
//        }
//        System.out.println("largest age : " + largestAges);

        int[] points = new int[]{10, 20, 30, 40, 50};

        int largest = points[0];
        for (int x = 0; x < points.length; x++) {
            if (largest < points[x]) {
                largest = points[x];
            }
        }
        System.out.println("largest points is : " + largest);

        int[] scores = {100, 200, 300, 400, 800, 500, 600, 700};

        int largestScores = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (largestScores < scores[i]) {
                largestScores = scores[i];
            }

        }
        System.out.println("largest score is :  " + largestScores);









    }
}
