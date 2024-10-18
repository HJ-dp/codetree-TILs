import java.util.*;

class Pair{
    int x,y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int N, K, answer;
    static HashMap<Pair,Integer> hs = new HashMap<>();
    static HashMap<Integer,Integer> hss = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            hss.put(i,a);
        }
        answer = 0;
        for(int i=0;i<N;i++){
            int temp = hss.get(i);
            for(int j=i+1;j<N;j++){
                if(hss.get(i) + hss.get(j) == K && hs.get(new Pair(i,j)) == null){
                    answer++;
                    hs.put(new Pair(i,j),1);
                    hs.put(new Pair(j,i),1);
                }
            }
        }
        System.out.println(answer);
    }
}