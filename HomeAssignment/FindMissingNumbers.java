package HomeAssignment;



import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
    
        int[] array = {1, 2, 3, 4, 10, 6, 8};

        Arrays.sort(array);

        System.out.println("Missing numbers:");
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            int next = array[i + 1];
            while (current + 1 != next) {
                current++;
                System.out.println(current);
            }
        }
    }
}

