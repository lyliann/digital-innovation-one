package challenges;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculateAverageGasoline {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int distance = reader.nextInt();
        double gasoline;
        try {
            gasoline = reader.nextDouble();
        } catch (InputMismatchException e) {
            gasoline = Double.parseDouble(reader.next());
        }
        double media = distance / gasoline ;
        System.out.println(String.format(Locale.ROOT,"%.3f km/l", media));
    }
}
