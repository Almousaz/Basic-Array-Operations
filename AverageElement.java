import java.util.Arrays;

public class AverageElement {
    public static void main(String[] args) {

//        int[] numbers = {5, 8, 9, 10, 15};
//        System.out.println(Arrays.toString(numbers));
//
//        int sum = 0;
//        int length = numbers.length;
//
//        for (int i = 0; i < length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println("sum :  " + sum);
//
//        int average = sum / length;
//        System.out.println("average : " + average);


        int[] costs = {100, 150, 200, 250, 300, 350};

        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
        }
        int average = sum / costs.length;
        System.out.println("average is : " + average);











    }
}
