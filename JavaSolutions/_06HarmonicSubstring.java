import java.util.*;

public class _06HarmonicSubstring{
    public static void main(String[] args) {

        String s = "aabbcc";
        int n = s.length();

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int answer = n;

        for (int c = 1; c <= 26; c++) {
            if (n % c != 0) {
                continue;
            }

            int each = n / c;
            int kept = 0;

            for (int i = 25; i >= 26 - c; i--) {
                kept += Math.min(freq[i], each);
            }

            answer = Math.min(answer, n - kept);
        }

        System.out.println(answer);
    }
}