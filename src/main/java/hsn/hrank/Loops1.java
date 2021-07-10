package hsn.hrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        List<Integer> multipliers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        multipliers.stream().map( i -> String.valueOf(N + " x " + i + " = " + i*N)).forEach(System.out::println);
    }
}