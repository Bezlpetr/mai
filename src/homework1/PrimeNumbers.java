package homework1;

public class PrimeNumbers {

    public static void main(String[] args) {

        int n = 20;
        boolean[] isCrossedOut = new boolean[n + 1];

        for (int i = 2; i < n; i++) {
            if (isCrossedOut[i] == false) {
                for (int j = 2; i * j <= n; j++) {
                    isCrossedOut[i * j] = true;
                }
            }
        }
        for (boolean k : isCrossedOut) {
            System.out.print(" " + k + " ");
        }

        System.out.println();

        for (int i = 2; i < n; i++) {
            if (isCrossedOut[i] == false) {
                System.out.print(" " + i + " ");
            }
        }
    }

}

