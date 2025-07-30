import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args){
        Scanner C_to_F = new Scanner(System.in);
        System.out.print("Please enter temperature in celsius = ");
        double celcius = C_to_F.nextDouble();
        double fahrenheit = celcius *9/5 + 32;
        System.out.println("The temperature in fahrenheit = " + fahrenheit);
    }
}
