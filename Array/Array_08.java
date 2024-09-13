import java.util.Scanner;

public class Array_08 {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("How many Rows : ");
        int rows = sc.nextInt();
        System.out.println("How many Columns : ");
        int colums = sc.nextInt();
        int [][] array= new int[rows][colums];
        getuserInput(array);
        System.out.println("Enter the target to search : ");
       int target=sc.nextInt();
        linearSearch(array,target);        
    }

    private static void linearSearch(int[][] array, int target) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    System.out.println("Found the "+target+" at index ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Oops "+target+" Not Found");
    }

    private static void getuserInput(int[][] array) {
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println("Enter the value for ("+i+","+j+") : ");
                array[i][j]=sc.nextInt();
            }
        }
    }
}
