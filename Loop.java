import java.util.*;

public class Loop {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(a*i);
        }
        sc.close();
    }
}
