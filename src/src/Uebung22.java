public class Uebung22 {


    static int[][] pascalTriangle(int r) {

        int[][] arr = new int[r][r];

        for (int i = 0; i < r; i++) {
            for (int a = 0; a <= i; a++) {
                if (a == 0 || a == i) {
                    arr[i][a] = 1;
                } else {
                    arr[i][a] = arr[i - 1][a - 1] + arr[i - 1][a];
                }
            }

        }
        return arr;
    }
}
