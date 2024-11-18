import java.util.*;

public class Main {
    static int N, K;
    static HashMap<Integer, Integer> hs = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<N;i++){
            hs.put(i,sc.nextInt());
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    int a1 = hs.get(i);
                    int a2 = hs.get(j);
                    int a3 = hs.get(k);
                    int b = a1 + a2 + a3;
                    if(i != j && j != k && i != k && b == K){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}