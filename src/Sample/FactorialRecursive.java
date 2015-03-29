package Sample;
import java.util.*;

public class FactorialRecursive {

    public int factorial(int n){
        if (n==1)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(new FactorialRecursive().factorial(num));
    }
}
