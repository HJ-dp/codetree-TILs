import java.util.*;
public class Main {
    static int N, max = 0;
    static int[][] map;
    static int[] dx = new int[]{0,1};
    static int[] dy = new int[]{1,0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j] = sc.nextInt();
            }
        }
        casa(0,0,0);
        
        System.out.println(max);

    }
    public static boolean inRange(int x, int y){
        return 0 <= x && x <N && 0 <= y && y < N;
    }

    public static void casa(int x, int y, int cnt){
        cnt += map[x][y];
        if(x == N-1 && y == N-1){
            max = Math.max(max, cnt);
            return;
        }
        for(int i=0;i<2;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(inRange(nx,ny)){
                casa(nx,ny,cnt);
            } 
        }
    }
}