package String;
import java.util.*;

public class GameofThrone1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String text = input.next();
        Map <Character,Integer> count = new HashMap<Character,Integer>();
        for(int i=0; i<text.length(); i++){
            if(!count.containsKey(text.charAt(i)))
                count.put(text.charAt(i),1);
            else
            count.put(text.charAt(i), 1+ count.get(text.charAt(i)));
        }
        int odd=0;
        for (char a: count.keySet()){
            if(count.get(a)%2!=0)
                odd++;
        }
        if(odd>1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
