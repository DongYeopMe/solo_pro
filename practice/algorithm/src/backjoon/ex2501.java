package backjoon;

import java.util.Scanner;

public class ex2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count=0;
        int result;
        for(int i=1; i<=n1;i++){
            if(n1%i==0){
                count++;
            }
            if(count==n2){
                result=i;
                System.out.print(result);
                break;
            }
            if(i==n1){
                System.out.print("0");
            }
        }
    }

}
