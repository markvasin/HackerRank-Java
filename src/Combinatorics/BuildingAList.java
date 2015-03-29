package Combinatorics;
import java.util.*;
/**
 * Created by Mvsmark on 3/27/2015.
 */
public class BuildingAList {
    private StringBuilder sb = new StringBuilder();
    private final String inputString;

    public BuildingAList(String in) {
        inputString = in;
    }

    public void combine(){
        combine(0);
    }

    public void combine(int start){

        for (int i=start; i<inputString.length(); i++){
            sb.append(inputString.charAt(i));
            System.out.println(sb);
            if(i<inputString.length()){
                combine(i+1);
            }
            sb.setLength(sb.length()-1);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for (int i=input.nextInt(); i>0; i--){
            input.nextInt();
            BuildingAList combo = new BuildingAList(input.next());
            combo.combine();
        }
    }
}
