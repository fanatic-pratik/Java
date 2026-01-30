import java.util.*;

public class recursion1 {

    public static void printNum(int n) {
        if(n == 0) return;

        System.out.println(n);
        printNum(n-1);
    }

    public static void printSum(int n , int i, int sum) {
        if(n == i){
            sum +=i;
            System.out.println(sum);
            return;
        }

        sum +=i;
        printSum(n,i+1,sum);
    }

    public static void main(String[] args) {
        int n = 5;
        //printNum(n);
        printSum(n, 1, 0);
    }
}
