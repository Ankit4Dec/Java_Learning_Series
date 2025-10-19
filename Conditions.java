import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        // int a = sc.nextInt();
        // int button = sc.nextInt();
        // int b = sc.nextInt();

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

        // if(a==b){
        //     System.out.println("Equal");
        // }else if(a>b){
        //         System.out.println("a is greater");
        //     } else{
        //         System.out.println("b is greater");
        //     }

        // int sum = a+b;
        // int sub = a-b;
        // int mul = a*b;
        // int div = a/b;
        // int mod = a%b;

        // switch (button) {
        //     case 1: System.out.println("Addition = " + sum);
        //         break;
        //     case 2: System.out.println("Subtraction = " + sub);
        //         break;
        //     case 3: System.out.println("Multiply = " + mul);
        //         break;
        //     case 4: System.out.println("Divide = " + div);
        //         break;
        //     case 5: System.out.println("Module = " + mod);
        //         break;
        //     default:
        //         break;
        // }


        switch (month) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default:
                break;
        }

    }
}
