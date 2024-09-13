import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("############# int[] ############# ");
        // Declare the array and intializing the array using for loop
        int[] array = new int[5];
        System.out.println("Array Before Input : " + Arrays.toString(array));
        System.out.println("Give input : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        // printing array using fore loop
        System.out.println("printing array using fore loop");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[0]);
        }
        System.out.println("Printing using Fore each loop ");
        // printing array using fore each loop
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("Printing using Arrays.toString()");
        System.out.println(Arrays.toString(array));

        System.out.println("############# String[] ############# ");
        String[] str = new String[5];
        System.out.println("Enter the inputs :  ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("Output : ");
        System.out.println(Arrays.toString(str));

        // Changing the value using the index number ;
        int index;
        System.out.println(Array.getLength(array));
        System.out.println("Enter any index number from 0 to " + (array.length - 1) + " : ");
        index= sc.nextInt();
        System.out.println("Enter the new Value : ");
        array[index]=sc.nextInt();
        System.out.println("New Array : ");
        System.out.println(Arrays.toString(array));
        
    }
}
