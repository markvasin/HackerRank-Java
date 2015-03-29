package Sorting;
import  java.util.*;

class IntrotoTutorialChallenges {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int size = input.nextInt();
        for (int i=0; i<size; i++){
            if (val==input.nextInt())
                System.out.println(i);
        }
    }
}
