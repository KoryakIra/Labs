package Lab1;

import java.util.Arrays;


/**
 * Created by koryak on 31.03.2016.
 */
public class ArrayInverterOptimizedTest {
    public static void main(String[]args){
        int arr[];
        arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.print(Arrays.toString(arr)+"->");
        array_inverter_optimized.invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
