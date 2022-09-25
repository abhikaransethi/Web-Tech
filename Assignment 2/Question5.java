import java.util.Scanner;

public class Question5 {
    public static void main(String[] arg){
        System.out.println("Input n");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        System.out.println("n\tn^2\tn^3\tn^4");
        for(int i=1; i<=n; i++){
            System.out.print(i+"\t");
            int num=i;
            for(int j=2; j<=4; j++){
                num=num*i;
                System.out.print(num+"\t");//print pow(i, j)
            }
            System.out.println();

        }
        input.close();

    }
}
