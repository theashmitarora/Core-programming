import java.util.Scanner;

public class area_of_a_circle {
    public static void main(String[] args){
        Scanner area = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle = ");
        double radius = area.nextDouble();
        double circle = (22.0/7) * radius * radius ;
        System.out.println("The area of the circle with " + radius +  "is " + circle);
    }
}
