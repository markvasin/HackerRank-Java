package String;
import java.util.*;
public class GemStones {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Map<Character,Integer> charcount = new HashMap<Character, Integer>();

        for (int i=0; i<num; i++){
            String text = input.next();
            Set<Character> thistext = new HashSet<Character>();
            for (int k=0; k<text.length(); k++){
                thistext.add(text.charAt(k));
            }
            for (Character a: thistext){
                if(!charcount.containsKey(a)){
                    charcount.put(a,1);
                }
                else {
                    charcount.put(a, charcount.get(a)+1);
                }
            }
        }
        int result = 0;
        for(int val:charcount.values()){
            if(val>=num)
                result++;
        }

        System.out.println(result);

    }
}
