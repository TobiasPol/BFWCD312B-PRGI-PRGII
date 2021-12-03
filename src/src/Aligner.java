public class Aligner {
    public static String alignLeft(String s, int i) {
        int sLength = s.length();
        if (i > sLength) {
            for (int a = 0; a < i - sLength; a++) {
                s = s + " ";
            }
        } else if (i < sLength) {
            for (int a = 0; a < sLength - i; a++) {
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }
}
