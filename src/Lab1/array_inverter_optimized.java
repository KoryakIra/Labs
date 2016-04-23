package Lab1;

/**
 * Created by koryak on 19.04.2016.
 */
public class array_inverter_optimized {
    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }

}
