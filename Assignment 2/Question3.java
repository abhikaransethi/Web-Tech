import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input month index");
        int ind=input.nextInt();
        switch(ind){
            case 1:
            System.out.println("Month: January\nDays: 31");
            break;
            case 2:
            System.out.println("Month: Febuary\nDays: 28");
            break;
            case 3:
            System.out.println("Month: March\nDays: 31");
            break;
            case 4:
            System.out.println("Month: April\nDays: 30");
            break;
            case 5:
            System.out.println("Month: May\nDays: 31");
            break;
            case 6:
            System.out.println("Month: June\nDays: 30");
            break;
            case 7:
            System.out.println("Month: July\nDays: 31");
            break;
            case 8:
            System.out.println("Month: August\nDays: 31");
            break;
            case 9:
            System.out.println("Month: September\nDays: 30");
            break;
            case 10:
            System.out.println("Month: October\nDays: 31");
            break;
            case 11:
            System.out.println("Month: November\nDays: 30");
            break;
            case 12:
            System.out.println("Month: December\nDays: 31");
            break;

        }
        input.close();
    }
}
