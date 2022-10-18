import java.util.Arrays;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        System.out.println(s);
        sc.close();
    }
}
