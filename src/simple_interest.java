import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args){
        Scanner interest = new Scanner(System.in);
        System.out.print("Please enter the principal amount = ");
        int principal = interest.nextInt();
        System.out.print("Please enter the rate of interest = ");
        double rate = interest.nextDouble();
        System.out.print("For how much time = ");
        int time = interest.nextInt();

        double simple_interest = (principal*rate*time)/100;

        System.out.println("The simple interest calculated = " + simple_interest);
    }
}
