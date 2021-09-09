package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEvenOddNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numLines = Integer.parseInt(buffer.readLine());
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numLines; i++) {
            myList.add(Integer.valueOf(buffer.readLine()));
        }

        myList.stream().filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        myList.stream().filter(n -> n % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
