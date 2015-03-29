package DynamicPrograming;
import java.util.*;

public class TheMaximumSubArray {

    public int maxslice(int[] arr){
        int max_slice = 0;
        int max_ending = 0;
        for (int i:arr){
            max_ending = Math.max(0, max_ending+i);
            max_slice = Math.max(max_slice, max_ending);
        }
        return max_slice;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i=0; i<t; i++){
            int n = input.nextInt();
            int[] arr = new int[n];
            int maxnoncont = 0;
            for (int j=0; j<n; j++){
                arr[j] = input.nextInt();
                if(arr[j]>0)
                    maxnoncont += arr[j];
            }
            int maxslice = new TheMaximumSubArray().maxslice(arr);
            if(maxnoncont!=0)
                System.out.println(maxslice+" "+maxnoncont);
            else {
                if(n==0){
                    System.out.println("0 0");
                }
                else {
                    Arrays.sort(arr);
                    System.out.println(arr[arr.length-1] + " " + arr[arr.length-1]);
                }
            }
        }
    }
}
