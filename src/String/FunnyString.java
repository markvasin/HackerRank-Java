package String;

import java.util.Scanner;

/**
 * Created by Mvsmark on 4/9/2015.
 */
public class FunnyString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            String str = input.next();
            for (int j = 0; j < str.length() - 1; j++) {
                if (Math.abs(str.charAt(j+1) - str.charAt(j)) != Math.abs(str.charAt(str.length()-2-j) - str.charAt(str.length()-1-j))) {
                    System.out.println("Not Funny");
                    break;
                }
                else {
                    if (j == str.length()-2) {
                        System.out.println("Funny");
                    }
                }
            }
        }
    }
}
