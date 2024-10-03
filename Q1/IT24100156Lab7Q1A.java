import java.util.Scanner;
public class IT24100156Lab7Q1A {
    public class void main (String[]args){
        Scanner value = new Scanner(System.in);

        System.out.print("Enter marks for four subjects: ");
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
        
        System.out.println("Average is : "+ average);
        System.out.println("Grade is : "+ grade);
    }
}