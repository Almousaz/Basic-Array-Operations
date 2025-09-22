import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {


//         Linear Search
//         any array


//        int[] numbers = {10, 20, 30, 40, 50};
//
//        System.out.println(Arrays.toString(numbers));
//        int target = 40;
//        boolean found = false;
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == target) {
//                System.out.println("Found " + target + " at index " + i );
//                found = true;
//                break;
//
//            }
//        }
//        if (found) {
//            System.out.println(target + " has found");
//        } else {
//            System.out.println(target + "not found");
//
//        }
//
//        int[] ages = new int[]{4, 8, 16, 22};
//        int target1 = 22;
//        boolean exist = false;
//
//        for (int i = 0; i < ages.length; i++) {
//
//            if (target1 == ages[i]) {
//                System.out.println(target1 + " has found in " + i);
//                exist = true;
//                break;
//
//            }
//        }
//        if (exist) {
//            System.out.println(target1 + " is exist");
//
//        } else {
//            System.out.println(target1 + " not exist");
//
//        }


        int[] pointsOfStudents = {10, 20, 30, 40, 50, 60, 70};

        int targetNumber = 50;
        boolean found = false;

        for (int i = 0; i < pointsOfStudents.length; i++) {
            if (pointsOfStudents[i] == targetNumber) {
                System.out.println("target " + targetNumber + " number has found in index " + i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("target has found");

        } else {
            System.out.println("target ahs not found");

        }



























    }
}
