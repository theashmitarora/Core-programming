import java.util.Scanner;

public class volume_cylinder {
    public static void main(String[] args){
        Scanner volume = new Scanner(System.in);
        System.out.print("Please enter the radius of the cylinder = ");
        double radius = volume.nextDouble();
        System.out.print("Please enter the height of the cylinder = ");
        double height = volume.nextDouble();
        double cylinder = (22.0/7) * radius * radius * height;
        System.out.println("The volume of the cylinder is " + cylinder);
    }
}
