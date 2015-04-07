package String;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mvsmark on 4/7/2015.
 */
public class MakeItAnagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();

        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (!dict.containsKey(c)) {
                dict.put(c, 1);
            }
            else {
                int val = dict.get(c);
                dict.put(c, ++val);
            }
        }
        int toRemove = 0;
        for (int i = 0; i < string2.length(); i++){
            char c = string2.charAt(i);
            if (dict.containsKey(c)) {
                int val = dict.get(c);
                dict.put(c, --val);
            }
            else {
                toRemove++;
            }
        }
        for (int val : dict.values()) {
            toRemove += Math.abs(val);
        }
        System.out.print(toRemove);
    }
}
