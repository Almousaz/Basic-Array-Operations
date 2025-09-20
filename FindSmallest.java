import java.util.Arrays;

public class FindSmallest {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50 , 2};
        System.out.println(Arrays.toString(numbers));

        int smallestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (smallestNumber > numbers[i]) {
                smallestNumber = numbers[i];
            }
        }
        System.out.println(" smallest number is " + smallestNumber);


        int[] numberOfCars = {15, 12, 20, 40, 32, 5, 1};

        int smallestNumbersOfCars = numberOfCars[0];
        for (int i = 1; i < numberOfCars.length; i++) {
            if (smallestNumbersOfCars > numberOfCars[i]) {
                smallestNumbersOfCars = numberOfCars[i];
            }
        }
        System.out.println("smallest number os cars is " + smallestNumbersOfCars);















    }
}
