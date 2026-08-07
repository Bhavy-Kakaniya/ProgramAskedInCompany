public class _07SimqualString {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(s1.length() != s2.length()){
            System.out.println("not simqual");
            return;
        }
        int[] freq = new int [26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero because 
        // they are decreased while traversing in other string
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("Strings are Not Simqual");
                return;
            }
        }
        System.out.println("Strings are Simqual");
    }
}