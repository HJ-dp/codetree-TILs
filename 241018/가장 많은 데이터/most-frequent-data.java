import java.util.*;

public class Main {
    static int N, max = Integer.MIN_VALUE;
    static HashMap<String,Integer> hs = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String s = sc.nextLine();
            if(hs.getOrDefault(s,0) + 1 > max){
                max = hs.getOrDefault(s,0) + 1;
            }
            hs.put(s,hs.getOrDefault(s,0) + 1);
        }
        System.out.println(max);
    }
}