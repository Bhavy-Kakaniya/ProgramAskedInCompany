import java.util.Scanner;

public class _1To15 {
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void oddEven(int n) {
        int odd = 0, even = 0;
        while (n != 0) {
            if (n % 10 % 2 == 0)
                even++;
            else
                odd++;
            n /= 10;
        }
        System.out.println(odd + " " + even);
    }

    public static void oddEvenOperator(int n) {
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void primeRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void armstrong(int n) {
        int num = n;
        int check = n;
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        int sum = 0;
        while (num != 0) {
            sum += Math.pow((num % 10), count);
            num /= 10;
        }
        if (check == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }

    public static void withoutArray() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double avg = 0;
        int i = 0;
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
            sum += n;
            i++;
            avg = (double) sum / i;
            System.out.println("max" + max + " " + "min" + min + " " + "avg" + avg);
        }
    }

    public static void angleBetweenHM(int h, int m) {
        double h_angle = 30 * h + 0.5 * h;
        double m_angle = 6 * m;
        double angle = Math.abs(h_angle - m_angle);

        if (angle > 180) {
            System.out.println(360 - angle);
        }
    }

    public static void power(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j <= a; j++) {
                sum += res;
            }
            res = sum;
        }
        System.out.println(res);
    }

    public static void divide(int a, int b) {
        int bigger = b, smaller = a;
        if (a > b) {
            bigger = a;
            smaller = b;
        }
        int quotient = 0;
        int remainder = 0;
        while ((bigger - smaller) >= 0) {
            remainder = bigger - smaller;
            quotient++;
            bigger -= smaller;
        }
        System.out.println("quotient: " + quotient + " remainder: " + remainder);
    }

    public static void ugly(int n) {
        if (n < 0) {
            System.out.println("not");
            return;
        }

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        if (n == 1)
            System.out.println("ugly");
        else
            System.out.println("not ugly");
    }

    public static void kaprekar(int n) {
        if (n < 0) {
            System.out.println("not");
            return;
        }
        int square = n * n;
        int digit = String.valueOf(n).length();
        int divisor = (int) Math.pow(10, digit);
        int right = square % divisor;
        int left = square / divisor;
        if (right + left == n) {
            System.out.println("Kaprekar");
        } else {
            System.out.println("not");
        }
    }

    public static void automorphic(int n) {
        if (n < 0) {
            System.out.println("not");
            return;
        }
        int square = n * n;
        int digit = String.valueOf(n).length();
        int divisor = (int) Math.pow(10, digit);
        int right = square % divisor;
        if (right == n) {
            System.out.println("automorphic");
        } else {
            System.out.println("not");
        }
    }

    public static void pronic(int n) {
        if (n < 0) {
            System.out.println("not");
            return;
        }
        int i = 0;
        while (i * (i + 1) < n) {
            i++;
        }
        if (i * (i + 1) == n) {
            System.out.println("pronic");
        } else {
            System.out.println("not");
        }
    }

    public static void chocolate(int price_for_each_chocolate, int rupees, int k_wrappers) {
        int chocolates = rupees / price_for_each_chocolate;
        int wrappers = chocolates;
        while (wrappers >= k_wrappers) {
            int new_chocolates = wrappers / k_wrappers;
            chocolates += new_chocolates;
            wrappers = (wrappers % k_wrappers) + new_chocolates;
        }
        System.out.println(chocolates);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // System.out.println(factorial(n));
        // System.out.println(sumOfDigit(n));
        // oddEven(n);
        // oddEvenOperator(n);
        // primeRange(n, m);
        // armstrong(n);
        // withoutArray();
        // angleBetweenHM(n, m);
        // power(n, m);
        // divide(n, m);
        // ugly(n);
        // kaprekar(n);
        // automorphic(n);
        // pronic(n);
        chocolate(1, 15, 3);
        sc.close();
    }
}