import java.util.Scanner;

public class GC01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        String ones[] = { "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

        String tens[] = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String ans = "";

        if (n >= 1000) {
            ans += ones[n / 1000] + " " + "Thousand" + " ";
            n = n % 1000;
        }

        if (n >= 100) {
            ans += ones[n / 100] + " " + "Hundred" + " ";
            n = n % 100;
        }

        if (n >= 20) {
            ans += tens[n / 10] + " ";
            n = n % 10;
        }

        if (n > 0) {
            ans += ones[n];
        }

        System.out.print(n + " to String: " + ans);
    }
}
