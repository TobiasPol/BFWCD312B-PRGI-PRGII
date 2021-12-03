public class Uebung1 {
    static void AufgabeA() {
            for (int i = -20; i < 21; i++) {
                System.out.println(i);
            }
    }

    static void AufgabeB() {
        for(int i=100; i<100; i--) {
            if (i % 5 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    static void AufgabeC() {
        int i = 0;
        do {
            System.out.println("1");
        }
        while(i<498); {
            i= i*i+1;
            System.out.println(i);
        }
    }

    static void AufgabeD() {
            int a = 0;
            int b = 1;
            int tmp = 0;

            for(int i = 0; i < 21; i++)
            {
                System.out.println(a + b);
                tmp = a + b;
                a = b;
                b = tmp;
            }

        }
    }

