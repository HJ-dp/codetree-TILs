import java.util.*;

public class Main {
    static int N, M;
    static HashMap<Integer,Integer> hs = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for(int i=0;i<N;i++){
            int tmp = sc.nextInt();
            hs.put(tmp,hs.getOrDefault(tmp,0)+1);
        }

        for(int i=0;i<M;i++){
            int tmp = sc.nextInt();
            if((hs.get(tmp))==null){
                System.out.print(0 + " ");
                continue;
            }
            System.out.print((hs.get(tmp)) + " ");
        }
    }
}