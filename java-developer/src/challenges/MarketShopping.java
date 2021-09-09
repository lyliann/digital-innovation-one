package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MarketShopping {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        if (n > 100) System.out.println("Por favor, informe um número menor ou igual a 100!");
        StringTokenizer in;
        List<String> myList;
        String out;
        for (int i = 0; i < n; i++) {
            myList = new ArrayList<>();
            in = new StringTokenizer(buffer.readLine());
            while (in.hasMoreTokens()) {
                myList.add(in.nextToken());
            }
            out = myList.stream().sorted().distinct().collect(Collectors.toList()).toString();
            System.out.println(out.replace("[", "").replace(",", "").replace("]", ""));
        }
    }
}
