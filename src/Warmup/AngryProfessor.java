package Warmup;

import java.util.*;

public class AngryProfessor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int n,k;
        for (int i=0; i<t; i++){
            n = input.nextInt();
            k = input.nextInt();
            int intime = 0;
            for(int j=0; j<n;j++){
                if (input.nextInt()<=0)
                    intime++;
            }
            if (intime >= k)
                System.out.println("NO");
            else
                System.out.println("YES");

        }



    }
}
