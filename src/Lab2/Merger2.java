package Lab2;

import java.util.Arrays;

/**
 * Created by koryak on 21.04.2016.
 */
public class Merger2 {
    public  static int[] merge (int[]fst,int[]snd)
    {
        int result[]=new int[fst.length+snd.length];
        int fstIndex=0;
        int sndIndex=0;
        int i=0;
        while (i<result.length){
            if (fst[fstIndex]<snd[sndIndex]) {
                result[fstIndex+sndIndex] = fst[fstIndex++];
                if (fstIndex==fst.length){
                    System.arraycopy(snd,sndIndex,result,++i,snd.length-sndIndex);
                    break;}
            }else{
                result[fstIndex+sndIndex]=snd[sndIndex++];
                if (sndIndex==snd.length){
                    System.arraycopy(fst,fstIndex,result,++i,fst.length-fstIndex);
                    break;}
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

