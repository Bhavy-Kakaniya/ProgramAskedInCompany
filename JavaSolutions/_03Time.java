import java.util.Scanner;

class Time {
    int hr, min, sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void addSeconds(int seconds) {
        sec += seconds;

        min += sec / 60;
        sec %= 60;

        hr += min / 60;
        min %= 60;
    }

    void subtractSeconds(int seconds) {
        sec -= seconds;
        while (sec < 0) {
            sec += 60;
            min--;
        }
        while (min < 0) {
            min += 60;
            hr--;
        }
    }

    void display() {
        System.out.printf("%d : %d : %d", hr, min, sec);
    }
}

public class _03Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour Minute Second: ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        Time t = new Time(h, m, s);

        System.out.print("Enter seconds to add: ");
        int add = sc.nextInt();
        t.addSeconds(add);
        System.out.print("Time after adding seconds = ");
        t.display();

        System.out.print("Enter seconds to subtract: ");
        int sub = sc.nextInt();
        t.subtractSeconds(sub);
        System.out.print("Time after subtracting seconds = ");
        t.display();
        sc.close();
    }
}
