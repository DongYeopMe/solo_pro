package backjoon;
import java.util.*;

public class ex_2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//나무 수
        int M = sc.nextInt();// 나무 가져가고싶은 길이
        int[] trees = new int[N];
        int high = 0;
        int low=0;
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
            if (high < trees[i]) {
                high = trees[i];
            }
        }
        //2진 탐색
        while(low<high){
            int mid = low +(high-low)/2;
            long sum =0;
            //나무 자를것들 다 더하기
            for(int i=0;i<trees.length;i++){
                //음수는 자르는 위치보다 작은 나무이기 때문에 패스한다.
                if(trees[i]-mid>0){
                    sum+=(trees[i]-mid);
                }
            }
            //자른 나무 합이 M보다 작은건 자르는 위치가 높은거기때문에 높이를 낮춰야 하기때문에 high를 낮춘다.
            if (sum < M) {
                high=mid;
            }
            //자른 나무 합이 M보다 작은건 자르는 위치가 낮은거기 때문에 덜 잘라야한다. 그래서 높이를 올리기 위해 low를 올린다.
            else{
                low = mid+1;
            }
        }
        System.out.println(low-1);
    }
}