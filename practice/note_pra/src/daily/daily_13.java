package daily;
import java.util.*;
public class daily_13 {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd",
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }
    public static String readVertically(String[] arr) {
        // TODO:
        //다시 풀어보자
        int max =0;
        for(int i=0; i < arr.length;i++){
            if(max< arr[i].length()){
                max=arr[i].length();
            }
        }
        String[] temp = new String[max];
        //기존의 배열을 순회합니다.
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            //해당 배열의 요소인 문자열을 순회합니다.
            for(int j = 0; j < str.length(); j++) {
                //임시 배열이 비어있다면
                if(temp[j] == null) {
                    //문자열의 j번째 char를 String으로 변환후 배열에 삽입 (세로위치 첫 문자열)
                    temp[j] = Character.toString(str.charAt(j));
                    //임시 배열이 비어있지 않다면, 임시 배열의 기존 문자열에 현재 j번째 char를 더해줍니다.
                } else {
                    temp[j] = temp[j] + str.charAt(j);
                }
            }
        }
        //배열을 순회하며 String으로 변환합니다.
        String result = "";
        for(int i = 0; i < temp.length; i++) {
            result = result+temp[i];
        }

        return result;

    }
}