class Employee{
    String name;
    String year;
    String address;
    Employee(String Name, String Year, String Address){
        name=Name;
        year=Year;
        address=Address;
    }
    public String toString(){
        return this.name+"\t"+this.year+"\t"+this.address;
    }
}

public class Question2 {
    public static void main(String[] args){
        System.out.println("Name"+"\t"+"Year of Joining "+"\t"+"Address");
        Employee E1=new Employee("Robert", "1994", "64C-WallsStreat");
        Employee E2=new Employee("Sam", "2000", "68D-WallsStreat");
        Employee E3=new Employee("John", "1999", "26B-WallsStreat");
        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        
    }
}
