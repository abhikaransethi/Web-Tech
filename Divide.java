import java.util.Scanner;

public class Divide {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Dividend" );
        num1 = input.nextInt();
        System.out.println("Input Divisor" );
        num2 = input.nextInt();
        while(num2==0){
            System.out.println("Enter Divisor other than zero" );
            num2 = input.nextInt();
        }
        int quotient= num1/num2;
        int remainder=num1%num2;
        System.out.println("The quotient is "+quotient);
        System.out.println("The remainder is "+remainder);
        input.close();
        
        
    }
}
