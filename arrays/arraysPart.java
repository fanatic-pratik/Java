import java.util.*;

public class arraysPart {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("enter the number of which you want to find index:");
        int numIndex = sc.nextInt();
        for(int j=0;j<size;j++){
            if(nums[j] == numIndex){
            
            System.out.println("number found at index :"+ j);
            }
        }
        sc.close();

    }
}
