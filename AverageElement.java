import java.util.Arrays;

public class AverageElement {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 9, 10, 15};
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum :  " + sum);

        int average = sum / length;
        System.out.println("average : " + average);

    }
}
