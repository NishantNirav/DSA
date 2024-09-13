import java.util.Scanner;

public class Array_06 {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enetr the String : ");
        String str = sc.nextLine();
        char ch = 'B';
        System.out.println("Searching for " + ch);
        boolean output = linearSearch(str, ch);
        if (output) {
            System.out.println("String Conatins the " + ch);
        } else {
            System.out.println("String does not Conatins the " + ch);

        }
    }

    static boolean linearSearch(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
