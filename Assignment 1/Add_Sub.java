import java.util.*;

public class Add_Sub {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number1" );
        num1 = input.nextInt();
        System.out.println("Input number2" );
        num2 = input.nextInt();
        System.out.println("Choose either '+' or '-'" );
        
        char operator=input.next().charAt(0);
        while(operator!='-' && operator!='+'){
            System.out.println("Choose either '+' or '-'" );
            operator=input.next().charAt(0);
        }
        
        if(operator=='+'){
            int res=num1+num2;
            System.out.println("The sum of the numbers is "+res) ;


        }
        else{
            int res=num1-num2;
            System.out.println("The difference of the numbers is "+res) ;
        }
        input.close();

        
        
    }
}
