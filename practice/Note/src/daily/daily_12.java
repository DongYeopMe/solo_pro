package daily;
import java.util.*;
public class daily_12 {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1,2,3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
    public static int[] reverseArr(int[] arr){
        // TODO:
        if(arr.length==0)return new int[]{};
        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));

        int[] dust = new int[head.length+tail.length];
        System.arraycopy(head,0,dust,0,head.length);
        System.arraycopy(tail,0,dust,head.length,tail.length);
        return dust;
    }

}
