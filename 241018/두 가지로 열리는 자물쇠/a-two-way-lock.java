import java.util.*;

public class Main {
    public static int N, answer;
    public static int[] com1 = new int[3];
    public static int[] com2 = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0;i<3;i++){
            com1[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            com2[i] = sc.nextInt();
        }
        answer = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    if(checkTwo(i,com1[0]) && checkTwo(j,com1[1]) && checkTwo(k,com1[2])) {
                        answer++;
                        continue;
                    };
                    if(checkTwo(i,com2[0]) && checkTwo(j,com2[1]) && checkTwo(k,com2[2])){
                        answer++;
                        continue;
                    } 
                }
            }
        }
        System.out.print(answer);
    }
    public static boolean checkTwo(int x, int y){
        if(x == N){
            if(y == 1 || y == 2){
                return true;
            }
        }else if (x == N-1){
            if(y == 1 || y == N){
                return true;
            }   
        }else if(y == N){
            if(x == 1 || x == 2){
                return true;
            }
        }else if(y == N-1){
            if(x == 1 || x == N){
                return true;
            }
        }
        return Math.abs(x - y) <= 2;
    }
}