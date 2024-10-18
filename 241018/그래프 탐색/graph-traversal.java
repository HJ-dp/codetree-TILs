import java.util.*;

public class Main {
    static final int MAX_NUM = 1000;
    static int N, M, answer = 0;
    
    static boolean[] visited = new boolean[MAX_NUM + 1];
    static ArrayList<Integer>[] map = new ArrayList[MAX_NUM+1];

    public static void DFS(int v){
        for(int i=0; i < map[v].size(); i++){
            int cur = map[v].get(i);
            if(!visited[cur]){
                visited[cur] = true;
                answer++;
                DFS(cur);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for(int i=1;i<=N;i++){
            map[i] = new ArrayList<>();
        }

        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a].add(b);
            map[b].add(a);
        }
        visited[1] = true;
        DFS(1);

        System.out.println(answer);
    }
}