package backjoon;

import java.util.Scanner;

public class ex_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        int y=0;
        int result =0;
        int[][] temp = new int[100][100];
        for(int i=0; i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            for(int j=x; j<x+10;j++){
                for(int k=y; k<y+10;k++){
                    temp[j][k]=1;
                }
            }
        }
        for(int i=0; i<temp.length;i++){
            for(int j=0; j<temp.length; j++){
                if(temp[i][j]==1){
                    result+=1;
                }
            }
        }
        System.out.println(result);
    }
}