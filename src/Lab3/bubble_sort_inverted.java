package Lab3;

/**
 * Created by koryak on 19.04.2016.
 */
public class bubble_sort_inverted {
    public static void sort1(int[] arr) {
        for (int barrier =0; barrier < arr.length; barrier++) {
            for (int index = arr.length-1; index >0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index -1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }

}
