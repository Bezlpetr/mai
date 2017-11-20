package homework1;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 8, 5, 8};
        System.out.println("Длина массива " + arr.length);
        System.out.print("Исходный массив");
        for (int n : arr) {
            System.out.print(" " + n + " ");
        }
        System.out.println();
        invert(arr);
        System.out.print("Инвертированный массив");
        for (int n : arr) {
            System.out.print(" " + n + " ");
        }
        System.out.println();

        System.out.println("Сумма максимальных членов = " + summMax(arr));

        shiftRight(arr);
        System.out.print("Сдвиг членов массива вправо");
        for (int n : arr) {
            System.out.print(" " + n + " ");
        }

    }

    public static void invert(int[] invertarr) {
        for (int i = 0; i < invertarr.length / 2; i++) {
            int temp = invertarr[i];
            invertarr[i] = invertarr[invertarr.length - 1 - i];
            invertarr[invertarr.length - 1 - i] = temp;
        }
    }

    public static int summMax(int[] arr) {
        int k = arr[0];
        int l = 1;
        for (int i = 1; i < arr.length; i++) {
            if (k == arr[i]) {
                l = l + 1;
            } else {
                if (k < arr[i]) {
                    k = arr[i];
                    l++;
                }
            }
        }
        return k * l;
    }

    public static void shiftRight(int[] arr) {
        int k = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = k;
    }
}
