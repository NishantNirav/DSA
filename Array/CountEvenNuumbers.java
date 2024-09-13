import java.util.Arrays;

/**
 * CountEvenDigits
 */
public class CountEvenNuumbers {

    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5, 6 };
        int array2[] = { 1, 3, 5, 7, 9 };
        int array3[] = { 2, 4, 6, 8 };
        int count = findCount(array1);
        System.out.println(count + " Even digits");
        count=findCount(array2);
        System.out.println(count + " Even digits");
        count=findCount(array3);
        System.out.println(count + " Even digits");

    }

    static int findCount(int[] array) {
        int count = 0;
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}