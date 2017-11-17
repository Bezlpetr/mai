package homework1;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 8, 5};
        System.out.println("длина массива " + arr.length);
        System.out.println("исходный массив");
        for (int n : arr) {
            System.out.println(n);
        }
        invert(arr);
        System.out.println("инвертированный массив");
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void invert(int[] invertarr) {
        for (int i = 0; i < invertarr.length / 2; i++) {
            int temp = invertarr[i];
            invertarr[i] = invertarr[invertarr.length - 1 - i];
            invertarr[invertarr.length - 1 - i] = temp;
        }
    }
}
