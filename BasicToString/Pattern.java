public class Pattern {
    public static void pattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= (2 * 5) - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = n - i + 1; j < n + i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n + i - 1; j <= 2 * n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        int n = 4;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int top = i - 1;
                int left = j - 1;
                int bottom = 2 * n - 1 - i;
                int right = 2 * n - 1 - j;
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5() {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            System.out.print("1");
            // Print ascending odd numbers starting from 3
            int num = 3;
            for (int j = 2; j < i; j++) {
                System.out.print(" * " + num);
                num += 2;
            }
            // Print descending odd numbers back down to 3
            num -= 4;
            for (int j = i - 2; j >= 2; j--) {
                System.out.print(" * " + num);
                num -= 2;
            }
            if (i > 1) {
                System.out.print(" * 1");
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        int n = 4;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i == 1 || i == 2 * n - 1) {
                    System.out.print("*\t");
                } else if (j == i || j == 2 * n - i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
    }
}