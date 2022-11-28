import java.util.Scanner;

public class Question2 {
    public static int Add(int a, int b){
        if(a<0 || b<0) {
            try{
                throw new ArithmeticException("Less than zero operator found");
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                return -1;
            }
        }
        return a+b;

    }
    
    public static int Subtract(int a, int b){
        if(a<0 || b<0) {
            try{
                throw new ArithmeticException("Less Than zero operator found");
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                return -1;
            }
        }
        return a-b;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        System.out.println("Addition: "+Add(a, b)+" Subtraction "+Subtract(a, b));
    }

}
