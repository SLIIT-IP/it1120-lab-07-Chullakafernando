import java.util.Scanner;
public class IT24100156Lab7Q1B {
    public class void main (String[]args){
        Scanner value = new Scanner(System.in);

        double[] average = new double[3];
        String[] grades = new String[3];

        for (int i=1;i<=3;i++){
            System.out.print("Enter marks for four subjects"+i+":");
        

        double sub1= value.nextDouble();
        double sub2= value.nextDouble();
        double sub3= value.nextDouble();
        double sub4= value.nextDouble();

        double average = (sub1+sub2+sub3+sub4)/4;

        String grade;
        if (average>=75){
            Grade="Distinction"
        }else (average>=50){
            Grade="Credit"
        }else (average>=0){
            Grade="Fail"
        }
        
        System.out.println("Student "+i+"- Average:"+average+",Grade:"+grade);
            
        }
    }
}