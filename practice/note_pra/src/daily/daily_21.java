package daily;

public class daily_21 {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 11, 13, 7,13,3,11,5});
        System.out.println(output); // 1859
    }
    public static int largestProductOfThree(int[] arr) {
        // TODO:
        int result =arr[0]*arr[1]*arr[2];
        int max=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1;j++){
                for(int z=j+1; z<arr.length; z++){
                    max = arr[i]* arr[j]* arr[z];
                    if(result<max){
                        result = max;
                    }
                }
            }
        }
        return result;
    }
}
