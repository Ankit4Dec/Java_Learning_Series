class Calculator{

    // int a;

    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}


public class Demo {
    
    public static void main(String a[]){
        int num1 = 14;
        int num2 = 588;

        // int result = num1 + num2;
        // System.out.println(result);

        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.err.println(result);

    }


}
