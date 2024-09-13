import java.util.Arrays;
import java.util.Scanner;

/**
 * Array_05
 */
public class Array_05 {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("How many numbers : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        addElemet(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the target : ");
        int target=sc.nextInt();
        int outpu=LinearSearch(array,target);
        System.out.println("Index : "+outpu);

    }

    // retun the index if found else retun -1
    static int LinearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static void addElemet(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the Value : ");
            array[i] = sc.nextInt();
        }
    }
}