package challenges;

import java.util.Scanner;

public class TheonsAnswer {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T[] = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = leitor.nextInt();
        }
        System.out.println(min(T) + 1);
    }

    public static int min(int[] arr) {
        int min = arr[0];
        int i = 0, position = 0;
        for (int elem : arr) {
            if (elem < min) {
                min = elem;
                position = i;
            }
            i++;
        }
        return position;
    }
}