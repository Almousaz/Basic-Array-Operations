import java.util.Arrays;

public class PrintNormalOrder {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));


        System.out.print("normal order : " );
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        int[] numbersOfHouse = {3, 5, 1, 7};

        System.out.println("print in order ");
        for (int i = 0; i < numbersOfHouse.length; i++) {
            System.out.print( numbersOfHouse[i] +  " ");
        }




    }
}
