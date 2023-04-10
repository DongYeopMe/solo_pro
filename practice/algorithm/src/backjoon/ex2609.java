package backjoon;

import java.util.Scanner;
//핵심 : 유클리드 호제법
public class ex2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=sc.nextInt();
        int n2 = sc.nextInt();

        int gcd = getGCD(Math.max(n1,n2), Math.min(n1,n2));
        int result = getLCM(n1,n2,gcd);

        System.out.println(gcd);
        System.out.println(result);
    }

    private static int getLCM(int n1, int n2, int gcd) {
        return (n1*n2)/gcd;
    }

    private static int getGCD(int max, int min) {
        while(min>0){
            int tmp =max;
            max=min;
            min=tmp%min;
        }
        return max;
    }
}
