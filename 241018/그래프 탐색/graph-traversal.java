import java.util.*;

public class Main {
    static int N, M, answer = 0;
    static int[][] map;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        visited[1] = true;
        DFS(1);

        System.out.println(answer);
    }

    public static void DFS(int v){
        for(int i=1;i<=N;i++){
            if(map[v][i]==1 && !visited[i]){
                visited[i] = true;
                answer++;
                DFS(i);
            }
        }
    }
}