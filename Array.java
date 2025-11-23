import java.util.Scanner;

public class Array {

    public static void main(String args[]){
        // int marks[] = new int[3]; 

        // int marks[] = {75,95,62};

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // marks[0] = 75; //Phy
        // marks[1] = 95; //Maths
        // marks[2] = 62; //Chem
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //Input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //Output
        for(int i=0; i<numbers.length ; i++){
            if(numbers[i] == x){
                System.out.println("X found at index : " + i);
            }
        }
    }
    
}
