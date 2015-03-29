package Sample;
import java.util.*;
/**
 * Created by Mvsmark on 3/24/2015.
 */
public class FibonacciRecursive {

    public int fibonacci(int n){
        if(n<=1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){

        System.out.println(new FibonacciRecursive().fibonacci(new Scanner(System.in).nextInt()));
    }
}
