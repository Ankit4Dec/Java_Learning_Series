import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // if(age>18){
        //     System.out.println("Adult");
        // } else{
        //     System.out.println("Not Adult");
        // }

        // if(x%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }

        if(a==b){
            System.out.println("Equal");
        }else if(a>b){
                System.out.println("a is greater");
            } else{
                System.out.println("b is greater");
            }

    }
}
