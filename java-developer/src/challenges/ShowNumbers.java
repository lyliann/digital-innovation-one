package challenges;
import java.util.Scanner;

public class ShowNumbers {

    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        int number;
        int count_positive = 0;
        int count_negative = 0;
        int count_pair = 0;
        int count_odd = 0;

        for (int i = 0; i < 5; i++) {

            number = reader.nextInt();

            if (number % 2 == 0) {
                count_pair++;
            } else {
                count_odd++;
            }

            if (number > 0) {
                count_positive++;
            } else if (number < 0) {
                count_negative++;
            }
        }

        System.out.println( count_pair + " valor(es) par(es)");
        System.out.println( count_odd + " valor(es) impar(es)");
        System.out.println( count_positive + " valor(es) positivo(s)");
        System.out.println( count_negative + " valor(es) negativo(s)");
    }
}
