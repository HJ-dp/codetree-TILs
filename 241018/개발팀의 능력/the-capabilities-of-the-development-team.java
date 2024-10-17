import java.util.*;
public class Main {
    public static int[] arr = new int[5];
    public static int max;
    public static int getDiff(int x, int y, int z, int k){
        int sum1 = arr[x] + arr[y];
        int sum2 = arr[z] + arr[k];
        int sum3 = max - arr[z] - arr[k] - arr[x] - arr[y];
        if(sum1 != sum2 && sum2 != sum3 && sum1 != sum3){
            return Math.abs(Math.max(sum1, Math.max(sum2, sum3)) - Math.min(sum1, Math.min(sum2, sum3)));
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            max += arr[i];
        }

        int answer = Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    for(int z=0;z<5;z++){
                        if(i != j && j != k && k != z && i !=k && i != z && j != z){
                            answer = Math.min(answer,getDiff(i,j,k,z));
                        }
                    }
                }
            }
        }
        if(answer ==Integer.MAX_VALUE) System.out.println(-1);
        else {
            System.out.println(answer);
        }
    }
}