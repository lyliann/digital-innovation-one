package challenges;

import java.util.Scanner;

public class RightArea {

    private static final int MAX_LENGTH = 12;
    private static final double NUMBER_OF_CELLS = 30d;

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        char O = scanner.next().toUpperCase().charAt(0);
        double[][] M = read(scanner);
        double sum = getSum(M);
        System.out.printf("%.1f%n", O == 'M' ?  getAverage(sum) : sum );
    }

    public static double[][] read(Scanner scanner) {
        double[][] matrix = new double[MAX_LENGTH][MAX_LENGTH];
        for (int i = 0; i <= MAX_LENGTH - 1; i++)
            for (int j = 0; j <= MAX_LENGTH - 1; j++)
                matrix[i][j] = Double.parseDouble(scanner.next());
        return matrix;
    }

    public static double getSum(double[][] matrix) {
        double sum = 0.0;
        for (int i = MAX_LENGTH/2 - 1; i >= 1; i--)
            for (int j = MAX_LENGTH - i; j <= MAX_LENGTH - 1 ; j++)
                sum += matrix[i][j] + matrix[MAX_LENGTH - 1 - i][j];

        return sum;
    }

    public static double getAverage(double sum) {
        return sum / NUMBER_OF_CELLS;
    }
}
