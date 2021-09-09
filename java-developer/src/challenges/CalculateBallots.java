package challenges;

import java.util.Scanner;
import java.util.*;

public class CalculateBallots {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        List<Integer> notas = new Vector();
        notas.add(100);
        notas.add(50);
        notas.add(20);
        notas.add(10);
        notas.add(5);
        notas.add(2);
        notas.add(1);
        System.out.println(notasInseridas);
        int total;
        for (Integer nota: notas) {
            total = 0;
            if (atual >= nota) {
                total = atual / nota;
                atual -= total * nota;
            }
            System.out.println(total + " nota(s) de R$ " + nota + ",00");
        }
    }
}
