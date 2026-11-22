import java.util.Scanner;

public class NumberSystem_16To23 {
    public static void decimalToBCD(int n) {
        String bcd = "";
        while (n > 0) {
            int digit = n % 10;
            String binary = "";
            for (int i = 1; i <= 4; i++) {
                binary = digit % 2 + binary;
                digit /= 2;
            }
            bcd = binary + " " + bcd;
            n /= 10;
        }
        System.out.println(bcd);
    }

    public static void binaryToDecimal(int n) {
        int decimal = 0;
        int i = 0;
        while (n > 0) {
            decimal += Math.pow(2, i) * n % 10;
            i++;
            n /= 10;
        }
        System.out.println(decimal);
    }

    public static void octalToHexaDecimal(int n) {
        int decimal = 0, base = 1, remainder;
        while (n != 0) {
            remainder = n % 10;
            decimal = decimal + remainder * base;
            base *= 8;
            n /= 10;
        }
        char hex[] = new char[20];
        int i = 0;
        while (decimal != 0) {
            remainder = decimal % 16;
            if (remainder < 10) {
                hex[i] = (char) (remainder + 48);
            } else {
                hex[i] = (char) (remainder + 55);
            }
            decimal /= 16;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hex[j]);
        }
    }

    public static void hexaDecimalToOctal(String n) {
        int decimal = 0;
        int power = 1;
        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - 48;
            } else if (ch >= 'A' && ch <= 'F') {
                value = ch - 55;
            } else if (ch >= 'a' && ch <= 'f') {
                value = ch - 87;
            } else {
                System.out.println("Invalid hexadecimal number");
                return;
            }
            decimal += value * power;
            power *= 16;
        }
        int octal = 0;
        power = 1;
        while (decimal != 0) {
            octal = octal + (decimal % 8) * power;
            decimal /= 8;
            power *= 10;
        }
        System.out.println(octal);
    }

    public static void decimalToOctal(int n) {
        int octal = 0;
        int power = 1;
        while (n != 0) {
            octal += (n % 8) * power;
            n /= 8;
            power *= 10;
        }
        System.out.println(octal);
    }

    public static void distance(int n, int m) {
        int xor = n ^ m;
        int count = 0;
        while (xor != 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor >>= 1;
        }
        System.out.println(count);
    }

    public static void infinite(int n) {
        long start = 1;
        long digitCount = 9;
        long length = 1;
        while (n > digitCount * length) {
            n -= digitCount * length;
            digitCount *= 10;
            start *= 10;
            length++;
        }
        long number = start + (n - 1) / length;
        int index = (int) ((n - 1) % length);
        String s = String.valueOf(number);
        System.out.println(s.charAt(index) - '0');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // decimalToBCD(n);
        // binaryToDecimal(n);
        // octalToHexaDecimal(n);
        // hexaDecimalToOctal("D");
        // decimalToOctal(n);
        // distance(10, 18);
        infinite(n);
    }
}
