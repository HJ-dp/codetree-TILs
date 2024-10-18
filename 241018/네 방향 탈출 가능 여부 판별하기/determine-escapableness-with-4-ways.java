import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static final int MAX_NUM = 100;
    static int N, M;
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,1,0,-1};
    static int[][] map;
    static boolean[][] visited;
    static Queue<Pair> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                map[i][j] = sc.nextInt();
            }
        }
        q.add(new Pair(0,0));
        visited[0][0] = true;

        BFS();
        int answer = visited[N-1][M-1] ? 1 : 0;
        System.out.println(answer);

    }

    public static boolean isRange(int x,int y){
        return 0 <= x && x < N && 0 <= y && y < M;
    }

    public static boolean canGo(int x, int y){
        return isRange(x, y) && map[x][y] == 1 && !visited[x][y];
    }

    public static void BFS() {
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int x = curr.x, y = curr.y;

            for(int i=0;i<4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(canGo(newX, newY)){
                    q.add(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
    }
}