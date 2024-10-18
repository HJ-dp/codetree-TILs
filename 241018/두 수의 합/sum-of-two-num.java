import java.util.*;
public class Main {
    static int N, K, answer;
    static HashMap<Integer,Integer> hs = new HashMap<>();
    static HashMap<Integer,Integer> hss = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            hss.put(i,a);
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        answer = 0;
        for(int i=0;i<N;i++){
            int temp = hss.get(i);
            if (hs.get(K-temp) != null){
                answer += hs.get(K-temp);

            }
        }
        System.out.println(answer/2);
    }
}