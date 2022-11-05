import java.util.Scanner;
import java.util.Vector;

public class Question1 {
        public static void main(String[] arg){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Size of Vector ");
            int vectorSize = input.nextInt();
            Vector vec = new Vector(vectorSize);
            // Take the objects to be stored in the vector from the user 
            System.out.println("ADD OBJECTS");
            for(int i =0;i<vectorSize;i++)
            {
                String obj = input.nextLine();
                vec.addElement(obj);
            }
            input.close();
        
            System.out.println("THE objects in Vector are ");
            for(int i =0;i<vectorSize;i++)
            {
                System.out.println(vec.elementAt(i));
            }
    }
}
