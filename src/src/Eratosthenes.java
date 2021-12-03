public class Eratosthenes {
    public static boolean[] getPrim(int max) {
        if (max < 2) {
            max = 2;
        }
        boolean[] isPrim = new boolean[max + 1];
        for (int i = max; i >= 2; i--) {
            isPrim[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (isPrim[i]) {
                int next = i + i;
                while (next <= max) {
                    isPrim[next] = false;
                    next += i;
                }
            }
        }
        System.out.println(isPrim);
        return isPrim;
    }
}
