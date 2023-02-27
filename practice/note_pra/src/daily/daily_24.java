package daily;
import java.util.*;
import java.util.stream.Collectors;
public class daily_24 {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }
    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
//        int count =0;
//        for(int i=0; i<sample.length; i++){
//            for(int j=0; j<base.length; j++){
//                if(sample[i]==base[j]){
//                    count++;
//                    break;
//                }
//            }
//        }
//        if(count==sample.length)
//            return true;
//        else return false;
        //배열을 List로 변경후, List.contains 명령어를 사용하여 중복여부 검사
        List<Integer> intList
                = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i : sample) {
            if (!intList.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
