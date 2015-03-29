package String;
import java.util.*;

public class AlternatingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i<t; i++){
            String a = input.next();
            int num = 0;
            for(int j=1; j<a.length();j++) {
                if (a.charAt(j-1) == a.charAt(j)) {
                    num++;
                }
            }
            System.out.println(num);
        }

    }


}
