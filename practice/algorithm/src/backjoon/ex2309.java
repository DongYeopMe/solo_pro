package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(sum-arr[i]-arr[j]==100){
                    arr[i]=0;
                    arr[j]=0;
                }
            }
        }
        for(int i:arr){
            if(i!=0)
                System.out.println(i);
        }
    }
}
