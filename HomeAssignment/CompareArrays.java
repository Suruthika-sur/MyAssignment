package HomeAssignment;






import java.util.ArrayList;
import java.util.List;

public class CompareArrays {
    public static void main(String[] args) {
        // Declare the arrays
        int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

        // Convert arrays to lists
        List<Integer> list1 = new ArrayList<>();
        for (int num : array1) {
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int num : array2) {
            list2.add(num);
        }

        // Compare the arrays and print the values if they are equal
        System.out.println("Common elements:");
        for (int num : list1) {
            if (list2.contains(num)) {
                System.out.println(num);
            }
        }
    }
}