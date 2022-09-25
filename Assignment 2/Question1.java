import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input the Score");
    double  score=input.nextDouble();
    if (score>80 && score<90){
        score+=5;//add 5 if score is between 80 and 90
    }
    System.out.println("The score is "+score);
    input.close();
}

}
