package Lab2;

import java.util.Arrays;

/**
 * Created by koryak on 21.04.2016.
 */
public class Merger1 {
    // wrong
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex<fst.length && sndIndex < snd.length) {
            if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
                if (fstIndex==fst.length){
                    for(int i=sndIndex;i<snd.length;i++){
                    result[fstIndex + sndIndex]=snd[sndIndex++];}
                        break;}
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
                if (sndIndex==snd.length){
                    for(int i=fstIndex;i<fst.length;i++){
                    result[fstIndex + sndIndex]=fst[fstIndex++];}
                    break;}

            }
        }
        return result;
    }
    public static void main(String args[]){
        int[]fst = {1,3,5,8,10,16,18,20,21,22,23};
        int[]snd = {2,4,6,7,9,11,12,13,14};
        int[]result =merge(fst,snd);



        System.out.print(Arrays.toString(fst));
        System.out.print(Arrays.toString(snd));
        System.out.println(Arrays.toString(result));
    }
}
