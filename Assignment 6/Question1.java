import java.util.Scanner;

public class Question1 {
    public static int Divide(int a, int b){
        if(a==0 || b==0) {
            try{
                throw new ArithmeticException("zero operator found");
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                return -1;
            }
        }
        return a/b;

    }
    
    public static int Multiply(int a, int b){
        if(a==0 || b==0) {
            try{
                throw new ArithmeticException("zero operator found");
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                return -1;
            }
        }
        return a*b;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        System.out.println("Multiplication: "+Multiply(a, b)+" Division: "+Divide(a, b));
    }

}
