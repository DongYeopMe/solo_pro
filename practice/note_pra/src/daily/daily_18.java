package daily;
import java.util.*;
public class daily_18 {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    public static int numberSearch(String str) {
        if (str.length() == 0) return 0;
        //숫자들을 문자열로 선언해서
        String search = "0123456789";

        //숫자를 더해줄 변수와 공백,숫자만 뺀 문자열 변수를 선언
        String temp = "";
        double sum = 0;

        for (int i = 0; i < str.length(); i++) {
            //digits의 값에서 str[i]의 값이 포함되어 있다면 (indefxOf는 값이 존재하면 해당 인덱스를, 없다면 -1을 리턴한다)
            if (search.indexOf(str.charAt(i)) != -1) {
                //숫자라면
                sum += Character.getNumericValue(str.charAt(i));
            }
            //만약 존재X,공백이 아니라면
            else if (str.charAt(i) != ' ') {
                temp = temp + str.charAt(i);
            }
        }

        //문자열 의 길이로 나눈값을 반올림해서 리턴
        double result = sum/temp.length();
        return (int) Math.round(result);
    }
}
