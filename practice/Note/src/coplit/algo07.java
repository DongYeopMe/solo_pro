package coplit;

public class algo07 {
    public static void main(String[] args) {
        int output = boringBlackjack(new int[]{2, 3, 4, 8, 13});
        System.out.println(output); // 3
    }
    public static int boringBlackjack(int[] cards) {
        // TODO:

        int result=0;
        for(int i=0; i<cards.length;i++){
            for(int j=i+1; j<cards.length; j++){
                for(int k =j+1; k<cards.length; k++){
                    int count=0;
                    int num = cards[i]+cards[j]+cards[k];
                    //소수 찾는 for문
                    for(int c=2; c<num; c++){
                        if(num%c==0){
                            count++;
                        }
                    }
                    if(count==0){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
