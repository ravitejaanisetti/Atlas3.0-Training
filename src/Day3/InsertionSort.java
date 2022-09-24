package Day3;
import java.util.*;

public class InsertionSort {
    public static void main(String[]args){
        int [] numArray={12,4,5,2,89,5,65};
        System.out.println("Original Array: "+Arrays.toString(numArray));

        for(int k=1; k<=numArray.length-1; k++) {
            int temp=numArray[k];
            int j=k-1;
            while (j>=0 && temp<=numArray[j]){
                numArray[j+1]=numArray[j];
                j=j-1;
            }
            numArray[j+1]=temp;
        }
        System.out.println("Sorted Array: "+ Arrays.toString(numArray));
    }
}
