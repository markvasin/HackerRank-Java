package Warmup;
import java.util.*;
/**
 * Created by Mvsmark on 3/27/2015.
 */
public class CutTheSticks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer[] num = new Integer[n];
        for(int i=0; i<n; i++){
            num[i] = input.nextInt();
        }
        while (true){
            int min = Integer.MAX_VALUE;
            for(int i=0; i<num.length; i++){
                if(num[i]!=0 && num[i]<min)
                    min = num[i];
            }
            int count = 0;
            int zeros = 0;
            for(int i=0; i<num.length; i++){
                if(num[i]>0) {
                    num[i] -= min;
                    count++;
                }
                else
                    zeros++;
            }
            if(zeros==n)
                break;
            else {
                System.out.println(count);
            }

        }
    }
}
