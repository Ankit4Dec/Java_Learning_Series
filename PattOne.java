import java.util.*;

public class PattOne {



    // Method 1: Using Fixed Integers

    // public static void main(String args[]){
    //     for(int i= 1;i<=4;i++){
    //         for(int j=1;j<=4;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }
    // }

    // Method 2: Using Variable


    // public static void main(String args[]){
    //     int n = 5;
    //     int m = 4;
    //     for(int i= 1;i<=n;i++){
    //         for(int j=1;j<=m;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }
    // }



    // Method 1: Taking input from the user for the Pattern Size

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
