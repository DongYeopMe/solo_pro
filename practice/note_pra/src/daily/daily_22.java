package daily;

import java.util.Arrays;

public class daily_22 {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{5, 4, 3,2,1});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]
    }
    public static int[] bubbleSort(int[] arr) {
        // TODO:

        while(true){
            int count=0;
            int[] before = arr;
            for(int i=0; i<arr.length-1; i++){
                int temp;
                if(arr[i]>arr[i+1]){
                    count++;
                    temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            if(count==0){
                break;
            }

        }
        return arr;
    }
}
