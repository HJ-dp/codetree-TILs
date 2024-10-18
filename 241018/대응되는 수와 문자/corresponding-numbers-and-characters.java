import java.util.*;
public class Main {
    static int N, M;
    static HashMap<String, Integer> hs = new HashMap<>();
    static HashMap<Integer,String> hss = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for(int i=0;i<N;i++){
            String s = sc.next();
            hs.put(s,i+1);
            hss.put(i+1,s);
        }
        for(int i=0;i<M;i++){
            String s = sc.next();
            if(isInteger(s)){
                System.out.println(hss.get(Integer.parseInt(s)));
                continue;
            }
            System.out.println(hs.get(s));
        }
    }

    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}