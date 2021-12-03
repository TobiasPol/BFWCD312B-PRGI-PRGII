public class Quersumme {
    static int quersumme(int z) {
        int sum = 0;
        while (z!=0) {
            sum = sum + z%10;
            z = z/10;
        }
        return sum;
    }
}
