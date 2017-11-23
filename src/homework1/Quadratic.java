package homework1;

public class Quadratic {
    public static void main(String[] args) {
        int a = 6;
        int b = 36;
        int c = 4;

        if (a != 0) {
            int d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("no solutions");
            } else if (d == 0) {
                System.out.println("x1 = " + (-b) / (2 * a));
            } else {
                double x1, x2;
                x1 = ((-b) + Math.sqrt(d)) / (2 + a);
                x2 = ((-b) - Math.sqrt(d)) / (2 + a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        } else {
            if (b != 0) {
                System.out.println("x1 = " + (double)(-c) / b);
            } else {
                System.out.println("no solutions");
            }
        }
    }

       /* if ((a == 0 & b == 0 & c == 0) | (a == 0 & b == 0)) {
            System.out.println("no solutions");
        } else if ((a == 0 & c == 0) | (c == 0 & b == 0)) {
            System.out.println("x1 = 0");
        } else if (b == 0 & (-c / a < 0)) {
            System.out.println("no solutions");
        } else if (b == 0 & (-c / a > 0)) {
            double x1, x2;
            x1 = Math.sqrt(-c / a);
            x2 = -Math.sqrt(-c / a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (c == 0) {
            double x1 = 0;
            double x2 = (double) (-b) / a;
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else {
            int d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("no solutions");
            } else if (d == 0) {
                System.out.println("x1 = " + (-b) / (2 * a));
            } else {
                double x1, x2;
                x1 = ((-b) + Math.sqrt(d)) / (2 + a);
                x2 = ((-b) - Math.sqrt(d)) / (2 + a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
}*/
}

