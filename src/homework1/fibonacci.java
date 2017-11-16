package homework1;

public class fibonacci {
    public static void main(String[] args) {
        long l = 1;
        for (int i = 0; i < 63; i++) {
            l = 2 * l;
        }
        System.out.println(l - 1);//max long
        /**
         * max n = 161
         */
        System.out.println(fibonumbers(161));
    }

    static long fibonumbers(int n) {
        if (n > 2) {
            long n1;
            long n2 = 1;
            long n3 = 1;
            for (int i = 3; i <= n; i++) {
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
            return n3;
        } else {
            return 1;
        }
    }

}
