package Lab2;

import java.util.Arrays;

/**
 * Created by koryak on 21.04.2016.
 */
public class Merger3 {
    public  static int[] merge (int[]fst,int[]snd)
    {
        int result[]=new int[fst.length+snd.length];
        int fstIndex=0;
        int sndIndex=0;
        int i=0;
        while (i<result.length){
           result[i]=fst[fstIndex]<snd[sndIndex]?fst[fstIndex++]:snd[sndIndex++];

            if (fstIndex==fst.length){
                    System.arraycopy(snd,sndIndex,result,++i,snd.length-sndIndex);
                break;
            }
            if (sndIndex==snd.length){
                    System.arraycopy(fst,fstIndex,result,++i,fst.length-fstIndex);
                break;
            }
            i++;
            }
        return result;
    }

    public static void main(String args[]){
        int[]fst = {1,3,5,8,10};
        int[]snd = {2,4,6,7,9,11,12,13,14};
        int[]result =merge(fst,snd);



        System.out.print(Arrays.toString(fst));
        System.out.print(Arrays.toString(snd));
        System.out.println(Arrays.toString(result));
    }
}
