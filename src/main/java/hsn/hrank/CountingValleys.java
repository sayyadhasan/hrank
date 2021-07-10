package hsn.hrank;

import java.io.*;

import static java.util.stream.Collectors.joining;

class CVResult {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int valleys = 0;
        int seaLevel = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                seaLevel++;
                if (seaLevel == 0) {
                    valleys++;
                }
            } else {
                seaLevel--;
            }
        }
        return valleys;
    }

}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CVResult.countingValleys(steps, path);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

