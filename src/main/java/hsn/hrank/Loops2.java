package hsn.hrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Term> terms = new ArrayList<>();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            terms.add(new Term(a, b, n));
        }
        terms.stream().forEach(e -> {
            evaluate(e);
            System.out.println();
        });
        in.close();
    }

    private static void evaluate (Term term) {
        for (int j = 0; j < term.getN(); j++) {
            BigInteger result = BigInteger.valueOf(term.getA());
            BigInteger multiply = BigInteger.valueOf(0);
            for (int k = 0; k <= j; k++) {
                multiply = multiply.add(BigInteger.valueOf(Double.valueOf(Math.pow(2, k)).longValue()).multiply(BigInteger.valueOf(term.getB())));
            }
            result = result.add(multiply);
            if (j == 0) {
                System.out.print(result);
            } else {
                System.out.print("," + result);
            }
        }
    }

    public static class Term {
        private int a;
        private int b;
        private int n;

        public Term(int a, int b, int n) {
            this.a = a;
            this.b = b;
            this.n = n;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getN() {
            return n;
        }
    }
}