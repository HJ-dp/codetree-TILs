import java.util.*;
public class Main {
    static HashMap<Character, Integer> hs = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = s.length();
        for(int i=0;i<N;i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0) + 1);
        }
        String answer = "None";
        for(int i=0;i<N;i++){
            if (hs.get(s.charAt(i)) == 1){
                answer = Character.toString(s.charAt(i));
                break;
            }
        }
        System.out.println(answer);

    }
}