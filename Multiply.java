import java.util.*;
public class Multiply {
    public static void main(String[] args){
        float num1;
        float num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number1" );
        num1 = input.nextFloat();
        System.out.println("Input number2" );
        num2 = input.nextFloat();
        float res= num1*num2;
        System.out.println("The product of the numbers is "+String.format("%.2f", res));
        input.close();
        
        
    }
}
