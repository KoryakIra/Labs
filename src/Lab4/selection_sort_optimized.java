package Lab4;

/**
 * Created by 111 on 19.04.2016.
 */
public class selection_sort_optimized {
    public static void sort(int[] arr) {
        int min,min_pos;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            min=arr[barrier];min_pos=barrier;
            for (int index = barrier+1; index < arr.length; index++) {
                if (arr[index]<min)
                {min=arr[index];
                    min_pos=index;}
            }  if (min_pos!=barrier) {
                int tmp = arr[barrier];
                arr[barrier] = arr[min_pos];
                arr[min_pos] = tmp;
            }
        }
    }
}
