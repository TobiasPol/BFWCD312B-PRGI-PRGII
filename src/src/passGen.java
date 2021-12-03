public class passGen {
    public static String generator(String sentence) {
        String [] words;
        String result;
        char last;
        boolean nextCharIsCapital = true;

        words = sentence.split(" +");
        result = "";
        for (String word: words) {
            last = word.charAt(word.length()-1);
            if (Character.isLetter(last)) {
                if(nextCharIsCapital) {
                    last = Character.toUpperCase(last);
                }
                else
                {
                    last = Character.toLowerCase(last);
                }
                nextCharIsCapital = ! nextCharIsCapital;
            }

            result += last;
        }
        return result;
    }
}
