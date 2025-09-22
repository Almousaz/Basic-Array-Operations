import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

//        int[] numbers = {10, 20, 50, 60, 30};
//        System.out.println(Arrays.toString(numbers));
//
//        int[] reversed = new int[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            reversed[i] = numbers[numbers.length - 1 - i];
//        }
//        System.out.println("Reversed : " + Arrays.toString(reversed));
//
//
////         way 2 Swiping
//        int[] ages = {3, 50, 21, 18, 7};
//
//        for (int i = 0; i < ages.length / 2; i++) {
//            int temp = ages[i];
//            ages[i] = ages[ages.length - 1 - i];
//            ages[ages.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(ages));


//        int[] points = {4, 5, 6, 7, 8, 9};
//
//        int[] reversedPoints = new int[points.length];
//
//        for (int x = 0; x < points.length; x++) {
//            reversedPoints[x] = points[points.length - 1 - x];
//        }
//        System.out.println(Arrays.toString(reversedPoints));
//
//        int[] values = {10, 11, 12, 13, 14, 15, 16};
//
//        for (int z = 0; z < values.length / 2; z++) {
//
//            int temp = values[z];
//            values[z] = values[values.length - 1 - z];
//            values[values.length - 1 - z] = temp;
//        }
//        System.out.println("reverse : " + Arrays.toString(values));


        int[] dataNumbers = new int[5];
        dataNumbers[0] = 51;
        dataNumbers[1] = 52;
        dataNumbers[2] = 53;
        dataNumbers[3] = 54;
        dataNumbers[4] = 55;

        System.out.println(Arrays.toString(dataNumbers));

        for (int j = 0; j < dataNumbers.length / 2; j++) {
            int tempNum = dataNumbers[j];
            dataNumbers[j] = dataNumbers[dataNumbers.length - 1 - j];
            dataNumbers[dataNumbers.length - 1 - j] = tempNum;
        }
        System.out.println("reversed number is : " + Arrays.toString(dataNumbers));






















    }
}
