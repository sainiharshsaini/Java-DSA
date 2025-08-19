import java.util.Arrays;
import java.util.Scanner;

public class Arr01 {

    static void PrintArr(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    static void MaxEleBF(int[] Arr) {
        Arrays.sort(Arr);
        System.out.println("Max element in an Arr(Brute Force): " + Arr[Arr.length - 1]);
    }

    static void MaxEleRecursive(int[] Arr) {
        int Max = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > Max) {
                Max = Arr[i];
            }
        }
        System.out.println("Max element in as Arr(Recursive): " + Max);
    }

    // if there is no duplicate element present
    static void SecondMaxMinBF(int[] Arr) {
        Arrays.sort(Arr);
        System.out.println("Second largest element in an Arr(Brute Force): " + Arr[Arr.length - 2]);
        System.out.println("Second smallest element in an Arr(Brute Force): " + Arr[1]);
    }

    static void SecondMaxMinBetter(int[] Arr) {
        int Max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;

        for (int i = 0; i < Arr.length; i++) {
            // if (Arr[i] < Min) {
            // Min = Arr[i];
            // }
            // if (Arr[i] > Max) {
            // Max = Arr[i];
            // }

            Min = Math.min(Min, Arr[i]);
            Max = Math.max(Max, Arr[i]);
        }

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > SecondMax && Arr[i] != Max) {
                SecondMax = Arr[i];
            }
            if (Arr[i] < SecondMin && Arr[i] != Min) {
                SecondMin = Arr[i];
            }
        }

        System.out.println("largest element in an Arr(Better): " + Max);
        System.out.println("smallest element in an Arr(Better): " + Min);

        System.out.println("Second largest element in an Arr(Better): " + SecondMax);
        System.out.println("Second smallest element in an Arr(Better): " + SecondMin);
    }

    static void SecondMaxMinOptimal(int[] Arr) {

    }

    static void checkSortedBF(int[] Arr) {
        boolean isSorted = true;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] > Arr[j]) {
                    isSorted = false;
                }
            }
        }

        System.out.println("Is Array sorted: " + isSorted);
    }

    static void checkSortedOptimal(int[] Arr) {
        boolean isSorted = true;
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i - 1] > Arr[i]) {
                isSorted = false;
            }
        }
        System.out.println("Is Array sorted: " + isSorted);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of an Arr: ");
        // int n = sc.nextInt();

        // int[] Arr = new int[n];

        int[] Arr = { 2, 4, 5, 6, 54, 5 };

        // System.out.print("Enter the elements of an Arr: ");
        // for (int i = 0; i < Arr.length; i++) {
        // Arr[i] = sc.nextInt();
        // }

        PrintArr(Arr);

        // MaxEleBF(Arr);
        // MaxEleRecursive(Arr);

        // SecondMaxMinBF(Arr);
        // SecondMaxMinBetter(Arr);
        // SecondMaxMinOptimal(Arr);

        // checkSortedBF(Arr);
        checkSortedOptimal(Arr);

    }
}
