import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary no: ");
        
        int binary = sc.nextInt();
        int ans = 0;
        int power = 0;
        
        while (binary > 0) {
            ans += ((binary % 10) * Math.pow(2, power));
            binary /= 10;
            power++;
        }

        System.out.print("Binary to decimal: " + ans);
    }
}