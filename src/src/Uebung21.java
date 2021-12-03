public class Uebung21 {
    public static double[][] transpose(double [][] arr){
        double[][] temp = new double[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[0].length; a++) {
                temp[a][i] = arr[i][a];
            }
        }
        return temp;
    }
}
