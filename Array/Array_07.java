import java.util.Arrays;
import java.util.Scanner;

public class Array_07 {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("How many Numbers : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        addElements(array);
        int min = fidMin(array);
        System.out.println(Arrays.toString(array));
        System.out.println(min + " is the samllest element");

    }

    // retun index of the minimum elemet
    static int fidMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                
            }
        }
        return min;
    }

    static void addElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the Vlue : ");
            array[i] = sc.nextInt();
        }
    }
}
