package hsn.hrank;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

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

        boolean valleyStarts = false;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                seaLevel += -1;
            } else {
                seaLevel += 1;
            }

            if (seaLevel < 0) {
                valleyStarts = true;
            }

            if (valleyStarts && i > 0 && seaLevel == 0) {
                valleyStarts = false;
                valleys++;
            }
        }
        return valleys;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

