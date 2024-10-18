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
        }
        answer = 0;
        for(int i=0;i<N;i++){
            int temp = hss.get(i);
            for(int j=i+1;j<N;j++){
                if(hss.get(i) + hss.get(j) == K){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}