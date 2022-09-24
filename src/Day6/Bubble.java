package Day6;
import java.util.Arrays;
public class Bubble {
    static void bubbleSort(int arr[]){
        int size= arr.length;
        for (int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j+1]-arr[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] data = {12,15,16,1,2,5,10,9,11};
        Bubble.bubbleSort(data);
        System.out.println("Sorted array un ascending order");
        System.out.println(Arrays.toString(data));
    }
}
