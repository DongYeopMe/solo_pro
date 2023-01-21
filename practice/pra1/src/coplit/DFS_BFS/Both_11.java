package coplit.DFS_BFS;

public class Both_11 {
    //{from,to,direction}
    public static void main(String[] args) {
        boolean result = getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println(result); // true

    }
    //DFS
//    public static boolean getDirections(int[][] matrix, int from, int to) {
//        //2차원 배열을 선언하고 거기에
//        int[][] result = new int[matrix.length][];
//        for(int i=0; i<matrix.length;i++){//다 복사됨
//            result[i]=Arrays.copyOf(matrix[i],matrix[i].length);
//        }
//        if(to==from){//from이랑 to가 같으면 도착한거임
//            return true;
//        }
//        for(int i=0; i<result.length;i++){//하나하나 돌려볼때 다 돌면 false를 하고
//            if(result[from][i]==1){
//                //해당 인덱스는 순회했기에 0으로 할당
//                result[from][i]=0;
//                if(getDirections(result,i,to)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    //BFS
    public static boolean getDirections(int[][] matrix, int from, int to) {
//        BFS는 큐를 이용한다
        int[][] result;
        return true;
    }
}