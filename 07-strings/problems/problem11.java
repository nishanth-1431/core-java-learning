/* 11. Count the number of words in a sentence.
   Topics: charAt(), loops, if-else
*/

public class problem11 {
    public static void main(String[] args) {

        String sentence = "Java is easy to learn";
        int words = 1;

        if (sentence.length() == 0) {
            words = 0;
        } else {
            for (int i = 0; i < sentence.length(); i++) {

                if (sentence.charAt(i) == ' ') {
                    words++;
                }

            }
        }

        System.out.println("Sentence : " + sentence);
        System.out.println("Number of words : " + words);
    }
}