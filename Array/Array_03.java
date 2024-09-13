import java.util.Arrays;
import java.util.Scanner;

public class Array_03 {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int[]  array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        changeValueUsingMethod(array);
        System.out.println(Arrays.toString(array));
        // Notes :  the value of original array is changed because the adress of original array is passed ,.
        // actual arry will be affected beacuse the origanl array adress is passed not the copy of the array 
    }
   
    public static void changeValueUsingMethod(int arr[]){
        int index;
        System.out.println("Enter the index number from 0 to "+((arr.length)-1));
        index=sc.nextInt();
        System.out.println("Enter the new Valuse : ");
        arr[index]=sc.nextInt();
    }
}
