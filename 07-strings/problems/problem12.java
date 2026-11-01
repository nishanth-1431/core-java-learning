/* 12. Find the longest word in a sentence.
   Topics: substring(), charAt(), loops, if-else
*/

public class problem12 {
    public static void main(String[] args) {

        String sentence = "Java programming is interesting";

        String longestWord = "";
        int start = 0;

        for (int i = 0; i <= sentence.length(); i++) {

            if (i == sentence.length() || sentence.charAt(i) == ' ') {

                String word = sentence.substring(start, i);

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }

                start = i + 1;
            }
        }

        System.out.println("Sentence      : " + sentence);
        System.out.println("Longest Word  : " + longestWord);
        System.out.println("Length        : " + longestWord.length());
    }
}