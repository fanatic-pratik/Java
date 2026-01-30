public class recursion2 {

    public static void factorial(int i,int n, int fact) {
        if(i>n){
            System.out.println(fact);
            return;
        }

        if(i==0){
            System.out.println(1);
            return;
        }
        fact = i * fact;
        factorial(i+1, n, fact);
    }

    public static void fibonacci(int i,int n, int fibo,int j) {
        if(n<j) return;

        
        int b = i+fibo;
        i=fibo;
        System.out.println(b);
        fibonacci(i, n, b,j+1);
    }

    public static void main(String[] args) {
        int n = 10;
        //factorial(1, n, 1);
        fibonacci(1, n, 1,1);

    }
}
