import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 50, 60, 30};
        System.out.println(Arrays.toString(numbers));

        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed : " + Arrays.toString(reversed));


//         way 2 Swiping
        int[] ages = {3, 50, 21, 18, 7};

        for (int i = 0; i < ages.length / 2; i++) {
            int temp = ages[i];
            ages[i] = ages[ages.length - 1 - i];
            ages[ages.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(ages));




    }
}
