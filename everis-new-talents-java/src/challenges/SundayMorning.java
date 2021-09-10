package challenges;

import java.util.Scanner;

public class SundayMorning {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);

            switch (hora) {
                case (7) -> System.out.println("Atraso maximo: " + min);
                case (8) -> System.out.println("Atraso maximo: " + (min + 60));
                case (9) -> System.out.println("Atraso maximo: " + (min + 120));
                default -> System.out.println("Atraso maximo: 0");
            }
        }
    }
}
