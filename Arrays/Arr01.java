import java.util.Scanner;

public class Arr01 {

    static void PrintArr(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Arr: ");
        int n = sc.nextInt();

        int[] Arr = new int[n];

        System.out.print("Enter the elements of an Arr: ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        PrintArr(Arr);
    }
}
