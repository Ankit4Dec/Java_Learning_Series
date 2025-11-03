import java.util.Scanner;

public class Functions {

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }


    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }


    // public static int mulForTwoNum(int a, int b){
    //     int product = a * b;
    //     return product;
    // }

    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial =1;

        for(int i =n; i>=1; i--){
            factorial= factorial *i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println(sum);
       
        // int product = mulForTwoNum(a, b);
        // System.out.println("Multiply for Two Number is => "+ product);

    }
    
}
