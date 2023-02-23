package daily;

import java.util.ArrayList;

public class daily_23 {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }
    public static int fibonacci(int num) {

        //재귀함수는 분명 return을 통해서 연달아 하는건데....
        /*
        * 메모이제이션 :프로그램이 동일한 계싼을 반복 해야할때, 이전에 계산한 값은 메모리에 저장해
        * 동일한 계산의 반복 수행을 제거해서 속도 빠르게 하는 기술
        */
        // dynamic with meoization: O(N)
        // 이미 해결한 문제의 정답을 따로 기록해두고,
        // 다시 해결하지 않는 기법
        // fibo(10)
        // = fibo(9) + fibo(8)= fibo(8) + fibo(7) + fibo(7) + fibo(6)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        return fibo(list,num);
    }
    public static int fibo(ArrayList<Integer> list,int num){
//
//        else if(arr[num]!=0){
//            return arr[num];
//        }
//        else{
//            return arr[num] =fibo(num-1,arr)+fibo(num-2,arr);
//        }
        if (list.size() <= num) {
            list.add(fibo(list, num - 1) + fibo(list, num - 2));
        }
        return list.get(num);
    }

}
