import java.util.*;



public class Main {
    public static int[] arr;

    public static int getDiff(int x,int y,int z){
        int sum1 = arr[x] + arr[y] + arr[z];
        int sum2 = 0;
        for(int i=0;i<6;i++){
            sum2 += arr[i];
        }
        return Math.abs(sum2 - sum1*2);
    }

    public static void main(String[] args) {
        arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                for(int k=j+1;k<6;k++){
                    minDiff = Math.min(minDiff,getDiff(i,j,k));
                }
            }
        }
        System.out.println(minDiff);
    }
    
}