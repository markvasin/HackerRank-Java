package String;

import java.util.*;

public class pangrams {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<Character> alpha = new HashSet<Character>();
        String s = input.nextLine();
        for (int i=0; i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i)) !=' ')
                alpha.add(Character.toLowerCase(s.charAt(i)));
        }

        if (alpha.size() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
