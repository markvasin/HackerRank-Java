package Combinatorics;

import java.util.*;
/**
 * Created by Mvsmark on 3/25/2015.
 */
public class BuildingAList_fail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<Character> charset;
        int t = input.nextInt();
        for (int i=0; i<t; i++){
            int n = input.nextInt();
            char[] aa = input.next().toCharArray();
            charset = new TreeSet<Character>();
            for(int j=0; j<aa.length; j++){
                charset.add(aa[j]);
            }
            Character[] arr = charset.toArray(new Character[charset.size()]);

            for (int j=0; j<arr.length; j++){//control first character
                char firstchar = arr[j];
                System.out.println(firstchar);
                for (int k=j+1; k<arr.length; k++){//control second to last character
                    for (int l=k;l<arr.length;l++ ) {//control print from k
                        System.out.print(firstchar);
                        for (int m = k; m <= l; m++) {//control print until that character
                            System.out.print(arr[m]);
                        }
                        System.out.println();
                    }

                }
            }

        }

    }
}
