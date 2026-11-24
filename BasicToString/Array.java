import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Array {

    public static int isInArray(int a[], int m) {
        if (a.length == 0) {
            return 0;
        }
        if (a[0] == m) {
            return 1;
        }
        return isInArray(Arrays.copyOfRange(a, 1, a.length), m);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void smallest() {
        int n = -1310;
        boolean negative = n < 0;
        n = Math.abs(n);
        int[] digit = new int[10];
        while (n != 0) {
            digit[n % 10]++;
            n /= 10;
        }
        int num = 0;
        if (!negative) {
            for (int i = 1; i <= 9; i++) {
                if (digit[i] > 0) {
                    num = num * 10 + i;
                    digit[i]--;
                    break;
                }
            }
            for (int i = 0; i <= 9; i++) {
                while (digit[i] > 0) {
                    num = num * 10 + i;
                    digit[i]--;
                }
            }
        } else {
            for (int i = 9; i >= 0; i--) {
                while (digit[i] > 0) {
                    num = num * 10 + i;
                    digit[i]--;
                }
            }
            num = -num;
        }
        System.out.println(num);
    }

    public static void twoSum() {
        int count = 0;
        int[] arr = { 1, 5, 7, 1 };
        int k = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int _38() {
        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }

        int i = 0;
        while (i < arr.length) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            if (count < 3) {
                return 0;
            }
            i++;
        }
        return 1;
    }

    public static void _39() {
        int arr[] = { 18, 43, 36, 13, 7 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (digitSum(arr[i]) == digitSum(arr[j])) {
                    max = Math.max(max, arr[i] + arr[j]);
                }
            }
        }
        System.out.println(max);
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        int r1 = 2, c1 = 2, r2 = 2, c2 = 2;
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];
        if (c1 != r2) {
            System.out.println("not possible");
        } else {
            System.out.println("Enter first matrix elements:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter second matrix elements:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Multiplication of two matrices:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }

    public static void median() {
        int arr1[] = { 1, 12, 15, 26, 38 };
        int arr2[] = { 2, 13, 17, 30, 45 };
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

        if (len % 2 == 0) {
            System.out.println((arr[len / 2 - 1] + arr[len / 2]) / 2);
        } else {
            System.out.println(arr[len / 2]);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(isInArray(arr, 4));
        // rotate();
        // smallest();
        // System.out.println(_38());
        // _39();
        // multiplication();
        median();
    }
}