import java.util.Scanner;

public class Question2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number1");
        int num1=input.nextInt();
        System.out.println("Input number2");
        int num2=input.nextInt();
        System.out.println("Input number3");
        int num3=input.nextInt();
        if(num1>=num2){
            if(num1>=num3){
                System.out.println(num1);

            }
            else{
                System.out.println(num3);
            }
        }
        else{
            if(num2>num3){
                System.out.println(num2);
            }
            else{
                System.out.println(num3);
            }
        }
        input.close();
    }
}
