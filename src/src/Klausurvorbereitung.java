public class Klausurvorbereitung {
    static void getMidlines(int stufe) {
        for (int i=0; i<stufe; i++) {
            System.out.print("=");
        }
        System.out.print("*");
        for (int a=0; a<((stufe-1)/2)-1; a++) {
            System.out.print(" ");
        }
        System.out.print("*");
        }
    }

