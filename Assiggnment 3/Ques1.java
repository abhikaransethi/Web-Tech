import java.util.Scanner;

public class Ques1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()!=s2.length()){
          System.out.println(s1.length()-s2.length());
        }
        else{
          for(int i=0;i<(s1.length()) && (i<s2.length());i++){
            if((int)s1.charAt(i)==(int)s2.charAt(i))continue;
            else System.out.println((int)s1.charAt(i) - (int)s2.charAt(i));break;

          }
        }
        
        sc.close();
    }

}