public class _05SentenceRanking {
    public static void main(String[] args) {
        String[] sentences = {
                "I love my pet",
                "A car ran fast",
                "He bought a hat",
                "The cat sat on the mat"
        };

        String target = "cat";
        int[] score = new int[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            int total = 0;

            for (String word : words) {
                if (word.length() != target.length())
                    continue;
                int match = 0;
                for (int j = 0; j < target.length(); j++) {
                    if (word.charAt(j) == target.charAt(j)) {
                        match++;
                    }
                }
                total += match;
            }
            score[i] = total;
        }
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - i - 1; j++) {

                if (score[j] < score[j + 1]) {

                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;

                    String s = sentences[j];
                    sentences[j] = sentences[j + 1];
                    sentences[j + 1] = s;
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + " = " + sentences[i]);
        }
        System.out.println("Final string:");

        for (String s : sentences)
            System.out.print(s + " ");
    }
}