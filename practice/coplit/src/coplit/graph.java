package coplit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    public static void main(String[] args) {
        int result = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {4, 5},
        });
        System.out.println(result); // 3
    }

    public static int connectedVertices(int[][] edges) {
        //final로 해도 배열을 바꿀수 없지만, 배열 요소는 바꿀수 있다.

        final int[] diretion = {0};

        //가장 큰값 찾기
        int max=0;
        //하나하나 순회하기
        for(int i=0; i<edges.length;i++){
            for(int j =0; j<edges[i].length;j++){
                if(max<edges[i][j])
                    max=edges[i][j];
            }
        }

        int[][] direction = new int[max+1][max+1];
        //방문 여부 배열 만들고
        boolean[] visited = new boolean[max+1];
        //컴포넌트 갯수
        int count=0;
        //그 2차원 배열로 길을 구현
        for(int i=0; i<edges.length; i++){
            int from = edges[i][0];
            int to= edges[i][1];

            direction[from][to]=1;
            direction[to][from]=1;
        }
        // 방문 여부를 체크한 배열을 모두 순회합니다.
        for(int vertex=0; vertex<visited.length;vertex++){
            if(!visited[vertex]){

                count++;
                visited = bfs_array(direction,vertex,visited);
//                visited = dfs_array(direction,vertex,visited);
            }
        }
        return count;
    }

    private static boolean[] dfs_array(int[][] direction, int vertex, boolean[] visited) {
        //현재 버택스에 방문 표시
        visited[vertex]=true;
        //해당 버텍스 순회
        for(int i=0; i<direction.length;i++){
            //길이 있고 미방문이면
            if(direction[vertex][i]==1&&!visited[i]){
                //재귀를 이용해서 인덱스중 1인 값으로 다시 실행(이어진길)
                dfs_array(direction,i,visited);
            }
        }
        //다 끝나고 방문 배열 반환
        return visited;
    }

    private static boolean[] bfs_array(int[][] direction, int vertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        //시작지점을 큐에 저장
        queue.add(vertex);
        //방문 했음
        visited[vertex]=true;
        //큐 다 비어질때까지 순회
        while(queue.size()>0){
            //현재 위치를 큐에서 꺼내고
            int temp = queue.poll();
            //전체 배열에서 현재 버텍스에만 순회 (1찾기)
            for(int i=0; i<direction.length;i++){
                //해당 버텍스가 false이고, 해당 인덱스가 1이면(미방문,길이 있는경우)
                if(direction[vertex][i]==1&& !visited[i]){
                    //해당 버텍스를 넣고
                    queue.add(i);
                    //방문할거니까 true로 돌려주기
                    visited[i]=true;
                }
            }
        }
        return visited;
    }


}
