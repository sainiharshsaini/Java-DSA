import java.util.Scanner;

public class GC02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        boolean isPalindrome = true;
        int j = str.length() - 1;
        int i = 0;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                System.out.println(i + " " + "" + j);
            }
            j--;
            i++;
        }

        System.out.print("String is palindrome: " + isPalindrome);
    }
}
