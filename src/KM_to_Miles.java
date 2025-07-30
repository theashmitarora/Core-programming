import java.util.Scanner;

public class KM_to_Miles {
    public static void main(String[] args){
        Scanner Km_to_Miles = new Scanner(System.in);
        System.out.print("Please enter the distance in kilometers (KM) = ");
        int distance = Km_to_Miles.nextInt();
        double miles = distance * 0.621371 ;
        System.out.println("The distance covered in kilometers when converted is = " + miles + " miles");
    }
}
