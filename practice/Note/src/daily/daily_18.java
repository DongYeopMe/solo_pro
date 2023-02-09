package daily;

public class daily_18 {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    //첫시도
    public static int numberSearch(String str) {
        // TODO:
        if(str.length()==0){
            return 0;
        }
        int num=0;
        int sum=0;
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=58|| str.charAt(i)<=48){
                num = str.charAt(i)-'0';
                sum+=num;
                count++;
            }
            else if(str.charAt(i)==' ')
                count++;

        }
        int result = sum/(str.length()-count);
        return result;
    }
    //
}
