public class Question4 {
    public static void main(String[] arg){
        int population=80000;
        int year=0;
        while(population<150000){
            int increment=5*population/100;//5% of population
            population+=increment;//adding the 5% of the population
            year+=1;
        }
        System.out.println("The population will exceed the 1.5 lakh mark in "+year+"th year");

    }
}
