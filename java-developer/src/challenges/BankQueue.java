package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BankQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numCaseTests = Integer.parseInt(buffer.readLine());
        int numClients;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> queueOrdered = new LinkedList<Integer>();
        StringTokenizer st;
        for (int i = 0; i < numCaseTests; i++) {
            numClients = Integer.parseInt(buffer.readLine());
            queue.clear();
            queueOrdered.clear();
            st = new StringTokenizer(buffer.readLine());
            while(st.hasMoreTokens()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            queueOrdered.addAll(queue.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
            int notChange = 0;
            for (int j = 0; j < numClients; j++) {
                if (queue.get(j) == queueOrdered.get(j)) notChange++;
            }
            System.out.println(notChange);
        }
    }
}
