public class BinarySerach {
    public static void main(String[] args) {

//         Binary Search
//         (only works on sorted arrays)

        int[] numbers = {10, 20, 30, 40, 50};

        int target = 50;

        boolean found = false;
        int low = 0;
        int high = numbers.length - 1;


        while (low <= high) {

        int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                System.out.println("Found " + target + "at index " + mid);
                found = true;
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        if (!found) {
            System.out.println( target + "Not found");
        }


        int[] numbersOfDesk = new int[]{2, 5, 8, 20, 50, 88, 90};
        int targetDesk = 14;

        int lowIndex = 0;
        int highIndex = numbersOfDesk.length - 1;
        boolean foundDesk = false;


        while (lowIndex <= highIndex) {

            int midIndex = (lowIndex + highIndex) / 2;
            if (numbersOfDesk[midIndex] == targetDesk) {
                System.out.println("Found " +  targetDesk + "desk at index " + midIndex);
                foundDesk = true;
                break;
            } else if (numbersOfDesk[midIndex] > targetDesk) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }


        }

        if (foundDesk) {
            System.out.println( targetDesk + " has found");
        }else {
            System.out.println( targetDesk +  " Not found");
        }


















    }
}
