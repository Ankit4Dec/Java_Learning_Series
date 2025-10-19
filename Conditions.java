import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // if(age>18){
        //     System.out.println("Adult");
        // } else{
        //     System.out.println("Not Adult");
        // }

        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
