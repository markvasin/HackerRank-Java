package Warmup;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int cycle = input.nextInt();
            int ans;
            if (cycle<=0)
                ans = 1;
            else {
                ans = (int) Math.pow(2, Math.ceil(((double)cycle / 2)) + 1) - 1 -(cycle%2);

            }
            System.out.println(ans);
        }

    }
}
