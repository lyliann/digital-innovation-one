package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairsNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
