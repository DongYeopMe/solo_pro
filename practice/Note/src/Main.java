import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output = divideChocolateStick(M, N);
        System.out.println(output);
// [[1, 4, 8], [2, 2, 4], [4, 1, 2]]
    }
    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:
        //M:아몬드 빼빼로,N: 누드빼빼로
        //[빼빼로 받게 되는 직원의수, 나누어 주는 아몬드 빼빼로의수,나누어 주는 누드 빼빼로의 수]
        ArrayList<Integer[]> result = new ArrayList<>();
        //최대 공약수 구한다.
        int GCD = gcd(M,N);

        for(int i=1; i<=GCD; i++){
            if(GCD % i ==0){
                result.add(new Integer[]{i,M/i,M/i});
            }
        }
        return result;
    }
    public static int gcd(int m, int n){
        if(m%n==0)
            return n;
        return gcd(n,m%n);
    }
}