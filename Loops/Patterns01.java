import java.util.Scanner;

public class Patterns01 {
    static void Print01(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Print02(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Print03(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Print04(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Print05(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Print06(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Print07(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Print08(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Print09(int n) {
        Print07(n);
        Print08(n);
    }

    static void Print10(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int star = i + 1;
            if (i >= n) {
                star = 2 * n - i - 1;
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Print11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void Print12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = 0; j < 2 * n - 2 * i - 2; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Print13(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void Print14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void Print15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void Print16(int n) {
        for (int i = 0; i < n; i++) {
            char ch =(char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void Print17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Print18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void Print19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Print20(int n) {
        int space = 2 * n - 2;

        for (int i = 0; i < 2 * n - 1; i++) {
            int star = i + 1;

            if (i >= n) {
                star = 2 * n - i - 1;
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n - 1) {
                space -= 2;
            } else {
                space += 2;
            }
        }
    }

    static void Print21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void Print22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        Print01(n);
        Print02(n);
        Print03(n);
        Print04(n);
        Print05(n);
        Print06(n);
        Print07(n);
        Print08(n);
        Print09(n);
        Print10(n);
        Print11(n);
        Print12(n);
        Print13(n);
        Print14(n);
        Print15(n);
        Print16(n);
        Print17(n);
        Print18(n);
        Print19(n);
        Print20(n);
        Print21(n);
        Print22(n);
    }
}