package HomeAssignment;




import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {3, 2, 11, 4, 6, 7};
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        System.out.println("The second largest element is: " + secondLargest);
    }
}

