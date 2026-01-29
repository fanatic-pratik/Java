import java.util.*;

public class patterns {
    public static void main(String[] args){

        //Pattern1
        // for(int i=0;i<4;i++){
        //    for(int j=0;j<5;j++){
        //         System.out.print("*");
                
        //     } 
        //     System.out.println("");
        // }

        //Pattern2
        // for(int i=0;i<4;i++){
        //    for(int j=0;j<5;j++){
        //         if((i==0 || i==3) || (j==0 || j==4)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
                
        //     } 
        //     System.out.println("");
        // }

        //pattern3
        // for(int i=5;i>0;i--){
        //    for(int j=0;j<5;j++){
        //         if(i>j){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
                
                
        //     } 
        //     System.out.println(" ");
        // }

        //pattern4
        // for(int i=1;i<6;i++){
        //    for(int j=1;j<=i;j++){
                
        //         System.out.print(j);
                
        //     } 
        //     System.out.println(" ");
        // }

        //pattern5
        // for(int i=1;i<6;i++){
        //    for(int j=1;j<=6-i;j++){
                
        //         System.out.print(j);
                
        //     } 
        //     System.out.println(" ");
        // }

        //pattern6
        // int n=1;
        // int j=0;
        // for(int i=1;i<6;i++){
        //    for(j=1;j<=i;j++){
                
        //         System.out.print(n+" ");
        //         n++;
        //     }
            
        //     System.out.println(" ");
        // }

        //pattern7
        // int n=1;
        // int j=0;
        // for(int i=1;i<6;i++){
        //    for(j=1;j<=i;j++){
        //         if((j+i)%2==0){
                
        //         System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //         n++;
        //     }
            
        //     System.out.println(" ");
        // }


        //pattern8 butterfly

        // for(int i=0;i<5;i++){
        //     for(int j=0;j<4;j++){
        //         if(j<=i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }

        //     for(int k=4;k>=0;k--){
        //         if(k<=i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }

            

        //     System.out.println(" ");
        // }

        // for(int p=0;p<4;p++){
        //     for(int l=4;l>0;l--){
        //         if(l<=p){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }

        //     for(int k=0;k<=4;k++){
        //         if(k>p){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println(" ");
        // }


        //pattern 9 rhombus
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<4-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=0;k<5;k++){
        //         System.out.print("*");
        //     }

        //     System.err.println("");
        // }

        //pattern 10 number pyramid

        // for(int i=1;i<6;i++){
        //     for(int j=6;j>i;j--){
        //         System.out.print(" ");
        //     }

        //     for(int k=1;k<=i;k++){
        //         System.out.print(i);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<6;i++){
            for(int j=6;j>i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
