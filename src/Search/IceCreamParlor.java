package Search;
import java.util.*;

public class IceCreamParlor {
    public void searchindex(int[] c,int M){ //brute force O(n^2)
        for (int j=0; j<c.length; j++){
            for (int k=j+1; k<c.length;k++){
                if(c[j]+c[k]==M){
                    System.out.println((j+1)+" "+(k+1));
                    return;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i=0; i<t; i++){
            int M = input.nextInt();
            int N = input.nextInt();
            int[] c = new int[N];
            for (int j=0; j<N; j++){
                int num = input.nextInt();
                c[j] = num;
            }
            new IceCreamParlor().searchindex(c,M);

        }
    }
}
