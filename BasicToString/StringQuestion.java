public class StringQuestion {

    public static void _54() {
        String s = "aabcbaa";
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                System.out.println("not palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("palindrome");
    }

    public static void _55() {
        String s = "abcde";
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            for (int j = n - 1; j > i; j--) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                    break;
                }
            }
        }
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }

    public static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void _56() {
        String s = "001101";
        int zero = 0, one = 0;
        int zeroOne = 0, oneZero = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                ans += oneZero;
                oneZero += one;
                zero++;
            } else {
                ans += zeroOne;
                zeroOne += zero;
                one++;
            }
        }
        System.out.println(ans);
    }

    public static void _57() {
        int i = 0;
        String s = "abca";
        while (s.charAt(i) != 'c') {
            i++;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < i && end > i) {
            if (s.charAt(start) != s.charAt(end)) {
                System.out.println("false");
                return;
            }
            start++;
            end--;
        }
        if (s.charAt(start) == s.charAt(end)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void _58() {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[][] arr = new String[s.length][s.length];
        int visited[] = new int[s.length];
        int group = 0;
        for (int i = 0; i < s.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            int k = 0;
            arr[group][k++] = s[i];
            visited[i] = 1;
            for (int j = i + 1; j < s.length; j++) {
                if (isAnagram(s[i], s[j]) && visited[j] == 0) {
                    arr[group][k++] = s[j];
                    visited[j] = 1;
                }
            }
            group++;
        }
        System.out.print("[");
        for (int i = 0; i < group; i++) {
            System.out.print("[");
            for (int j = 0; j < s.length; j++) {
                if (arr[i][j] != null) {
                    System.out.print(arr[i][j] + ",");
                }
            }
            System.out.print("],");
        }
        System.out.print("]");
    }

    public static boolean _59() {
        String s = "2e10";
        int start = 0;
        int end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        boolean digit = false;
        boolean dot = false;
        boolean exp = false;

        for (int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit = true;
            }
            else if (ch == '+' || ch == '-') {
                if (i != start && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else if (ch == '.') {
                if (dot || exp) {
                    return false;
                }
                dot = true;
            }
            else if (ch == 'e' || ch == 'E') {
                if (exp || !digit) {
                    return false;
                }
                exp = true;
                digit = false;
            }
            else {
                return false;
            }
        }
        return digit;
    }

    public static void _60() {
        String s = "a3bc4dE5F2G7H";
        String ans = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int count = s.charAt(i) - '0';
                char ch = s.charAt(i + 1);
                for (int j = 0; j < count; j++) {
                    ans += ch;
                }
                i += 2;
            } else {
                ans += s.charAt(i);
                i++;
            }
        }
        System.out.println(ans);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int freq[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void _61() {
        String s = "i!!!h.g.f,e'd,cba ";

        String store = "";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                store += s.charAt(i);
            }
        }
        int k = store.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                ans += store.charAt(k--);
            } else {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // _54();
        // _55();
        // _56();
        // _57();
        // _58();
        // _59();
        // _60();
        // _61();
    }
}