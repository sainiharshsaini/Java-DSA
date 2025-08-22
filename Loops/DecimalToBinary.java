import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal no: ");

        int decimal = sc.nextInt();
        int ans = 0;
        int power = 0;
        while (decimal > 0) {
            ans += ((decimal % 2) * Math.pow(10, power));
            power++;
            decimal /= 2;
        }

        System.out.print("Decimal to binary: " + ans);
    }
}
