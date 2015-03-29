package HackCompettition;

import java.util.*;

/**
 * Created by Mvsmark on 3/28/2015.
 */
public class MagicalGirl {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int strength = 0;
            int dieindex = 0;
            boolean die = false;
            Integer[] num = new Integer[n];
            for (int j = 0; j < n; j++) {
                num[j] = input.nextInt();
            }
            // check die without magic
            for (int j = 0; j < n; j++) {
                strength += num[j];
                if (strength < 0) {
                    die = true;
                    dieindex = j;
                    break;
                }
            }

            if (die) {
                // check min value until die index to use magic on
                int min = Integer.MAX_VALUE;
                int minindex = 0;
                for (int j = 0; j <= dieindex; j++){
                    if (num[j] < min){
                        min = num[j];
                        minindex = j;
                    }
                }
                num[minindex] *= -1;
                die = false;
                dieindex = 0;
                strength = 0;
                // check die index again with magic used
                for (int j = 0; j < n; j++) {
                    strength += num[j];
                    if (strength < 0) {
                        die = true;
                        dieindex = j + 1;
                        break;
                    }
                }
                if (die)
                    System.out.println(dieindex);
                else
                    System.out.println("She did it!");
            }
            else {
                System.out.println("She did it!");
            }
        }


    }
}

