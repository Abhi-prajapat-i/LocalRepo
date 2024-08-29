package LocalRepo;
import java.util.*;
public class SumOfTwoNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();

        operation op = new operation();

        System.out.println("Sum is "+(num1+num2));
        op.subtract(num1, num2);
        op.multiply(num1, num2);
        op.Divide(num1, num2);
    }
}
// create operations class.
class operation{
    // Multiplication function.
    void multiply(int a , int b){
        System.out.println("Multiplication is "+(a*b));
    }
    // Subtraction Functio .
    void subtract(int a , int b){
        System.out.println("subtraction is "+(a-b));
    }
    // Division Function.
    void Divide(int a , int b){
        if(a==0){
            System.out.println("infinity");    
        }else{
            System.out.println("Division is "+(a/b));
        }
        
    }
}
