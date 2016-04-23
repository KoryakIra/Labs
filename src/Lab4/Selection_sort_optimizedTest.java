package Lab4;

import java.util.Arrays;

/**
 * Created by koryak on 31.03.2016.
 */
public class Selection_sort_optimizedTest {
    public static void main(String[] args) {
            int[][] data = {
                    {1},
                    {2,1},
                    {2,3,1},
                    {1, 4, 3, 2},
                    {4, 3, 1, 5, 2},
                    {2, 1, 3, 6, 5, 4},
            };
            for (int[] arr : data) {
                System.out.print(Arrays.toString(arr) + " -> ");
                selection_sort_optimized.sort(arr);
                System.out.println(Arrays.toString(arr));
            }
        }
    }


