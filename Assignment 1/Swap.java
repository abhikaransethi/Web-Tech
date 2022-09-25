import java.util.*;

public class Swap {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number1");
        num1 = input.nextInt();
        System.out.println("Input number2");
        num2 = input.nextInt();
        input.close();
        int sum=num1+num2;
        int diff=num1-num2;
        num1=(sum-diff)/2;
        num2=(sum+diff)/2;
        System.out.println("Swapping the two numbers we get "+num1+" "+num2 );
        int temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("Swapping the two numbers again we get "+num1+" "+num2 );

    }

}
