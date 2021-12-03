public class dHondt {
    public static void main(String[] args) {
        double wahlergebnis[] = {416, 338, 246};
        int anz_mandate = 10;
        int anz_parteien = wahlergebnis.length;
        int[] mandate = new int[anz_parteien];
        double[][] matrix = new double[anz_mandate][anz_parteien];
        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int spalte = 0; spalte < matrix[0].length; spalte++) {
                matrix[zeile][spalte] = wahlergebnis[spalte] / (zeile + 1);
                System.out.print((int) (100 * matrix[zeile][spalte]) / 100. + ", ");
            }
            System.out.println();
        }
        for (int k = 1; k <= anz_mandate; k++) {
            int max_spalte = findemax(matrix);
            mandate[max_spalte]++;
        }
        for (int i = 0; i < anz_parteien; i++)
            System.out.println("Partei " + (i + 1) + " erreicht "
                    + mandate[i] + " Mandate.");
    }

    public static int findemax(double[][] m) {
        double max = 0;
        int maxspalte = 0;
        int maxzeile = 0;
        for (int zeile = 0; zeile < m.length; zeile++) {
            for (int spalte = 0; spalte < m[0].length; spalte++) {
                if (m[zeile][spalte] > max) {
                    max = m[zeile][spalte];
                    maxspalte = spalte;
                    maxzeile = zeile;
                }
            }
        }
        m[maxzeile][maxspalte] = 0;
        return maxspalte;
    }
}
