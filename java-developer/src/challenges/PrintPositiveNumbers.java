package challenges;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintPositiveNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double number;
        int count = 0;
        for (int i = 0 ; i <= 5 ; i++) {
            number = Double.parseDouble(br.readLine());
            if (number > 0)
                count++;
        }
        System.out.println(count + " valores positivos");
    }
}
