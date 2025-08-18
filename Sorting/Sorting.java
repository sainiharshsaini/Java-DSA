import java.util.Scanner;

public class Sorting {
    static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void SelectionSort(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[minIndex] > Arr[j]) {
                    minIndex = j;
                }
            }

            int temp = Arr[minIndex];
            Arr[minIndex] = Arr[i];
            Arr[i] = temp;
        }
    }

    static void BubbleSort(int[] Arr) {
        System.out.println("Bubble Sort-->");
        for (int i = Arr.length - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    static void InsertionSort(int[] Arr) {
        System.out.println("Insertion sort-->");
        for (int i = 0; i < Arr.length; i++) {
            int j = i;
            while (j > 0 && Arr[j - 1] > Arr[j]) {
                int temp = Arr[j - 1];
                Arr[j - 1] = Arr[j];
                Arr[j] = temp;
                j--;
            }
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

        System.out.print("Unsorted Arr: ");
        PrintArray(Arr);

        // SelectionSort(Arr);
        // BubbleSort(Arr);
        InsertionSort(Arr);

        System.out.print("Sorted Array: ");
        PrintArray(Arr);
    }
}
