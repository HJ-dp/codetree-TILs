import java.util.*;

public class Main {
    static int N,T;
    static int now = 0;
    static int nx, ny, answer = 0;
    public static void main(String[] args) {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        sc.nextLine();
        nx = (N-1)/2;
        ny = (N-1)/2;
        String com = sc.nextLine();
        int[][] map = new int[N][N+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j] = sc.nextInt();
            }
        }
        answer += map[nx][ny];
        for(int i=0;i<T;i++){
            int cNum = 0;
            if(com.charAt(i)=='F' && isRange(nx + dx[now],ny + dy[now]) ){
                nx = nx + dx[now];
                ny = ny + dy[now];
                answer += map[nx][ny];
            }
            else if(com.charAt(i)=='L') cNum = -1;
            else if(com.charAt(i)=='R') cNum = 1;
            now = turnning(now,cNum);
            
        }
        System.out.println(answer);

    }
    public static boolean isRange(int x, int y){
        return 0 <= x && x < N && 0 <= y && y < N;
    }
    public static int turnning(int x, int y){
        x = (x + y + 4) % 4;
        return x;
    }
}