public class Framer {
    public static String getFramedLongArray (long [][] la) {
        boolean moreChars = false;
        for (int i=0; i<la[0].length; i++) {
            if (la[i][0]>4.0) {
                moreChars = true;
            }
            for (int x=0; x<la.length; x++) {
                if (la[0][x]>4.0) {
                    moreChars = true;
                }
            }
        }
        if(!moreChars) {
            for (int l = 0; l < la.length; l++) {
                for (int k = 0; k < la[0].length; k++) {
                    for (int j = 0; j < la[0].length; j++) {
                        System.out.print("+----");
                    }
                    System.out.println("+");
                    System.out.print("|");
                    for (int u = 0; u < la[0].length; u++) {
                        System.out.print(la[0][u]);
                        System.out.print("|");
                    }
                }
            }
        }

        return "";
    }
}
