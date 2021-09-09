package challenges;

import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        a = input.nextInt();
        String message  = switch(a)
        {
            case 61: yield "Brasilia\n";

            case 71:  yield "Salvador\n";

            case 11: yield "Sao Paulo\n";

            case 21: yield "Rio de Janeiro\n";

            case 32: yield "Juiz de Fora\n";

            case 19: yield "Campinas\n";

            case 27: yield "Vitoria\n";

            case 31: yield "Belo Horizonte\n";

            default: yield "DDD nao cadastrado\n";
        };
        System.out.println(message);
    }
}
