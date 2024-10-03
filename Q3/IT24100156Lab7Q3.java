import java.util.Scanner;
public class IT24100156Lab7Q3{
    private static Object Customer;

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        final double Discount_RATE=0.005;

        for(int i=1;1<=5;i++){
            System.out.print("Enter total bill amount for customer"+i+":");
            double totalBill=scanner.nextDouble();

            System.out.print("Enter mode of payment(C for cash, 0 for other): ");
            char paymentMode=scanner.next().charAt(0);

            if (paymentMode=='C'||paymentMode=='c'){
                double discount=totalBill*Discount_RATE;
                double finalAmount=totalBill-discount;
                System.out.printf(Customer %d-Discount: %.2f,Amount to Pay:%.2f%n",i,discount,finalAmount);
            }else if (paymentMode=='O'||paymentMode=='o') {
                System.out.printf("Customer %d-No discount applied.Amount to Pay:%.2f\n',i,totalBill");
            }else {
                System.out.println("Payment Mode is Note Valid");
            }
            }
        }
    }
}