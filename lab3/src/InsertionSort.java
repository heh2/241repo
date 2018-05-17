/**
 * Created by heh2 on 4/26/18.
 */
public class InsertionSort {
    public static int[] insertionSort(int[] originalArray){

    for(int l = 0; l < originalArray.length; l++){
       int j = l;
        while (j > 0 && (originalArray[j-1] > originalArray[j])){
            swap(originalArray[j],originalArray[j-1],originalArray,j);
                j = --j;
            }
        }

return originalArray;
    }
    public static int[] swap(int valueA,int valueB, int[] x,int position){

        x[position]=valueB;
        x[position-1]=valueA;
        return x;
    }

}
