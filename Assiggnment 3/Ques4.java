import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        while(n!=1){
          if(n%2==0){
            n /=2;
          }
          else{
            n = n*3 +1;
          }
          System.out.println(n);
        }
        sc.close();
    }
}
