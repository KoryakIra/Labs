package Lab3;

import java.util.Arrays;

/**
 * Created by koryak on 31.03.2016.
 */
public class BubbleSorterInvertedTest {
    public static void main(String[]args){
        int[][]data={
                {1},
                {1,2},
                {2,1,3},
                {3,4,2,1},
                {4,3,2,1,5},
                {2, 6, 3, 5, 1, 4},
        };
        for (int arr[]:data){
            System.out.print(Arrays.toString(arr)+" -> ");
            bubble_sort_inverted.sort1(arr);
            System.out.println(Arrays.toString(arr));
        }

    }

}
