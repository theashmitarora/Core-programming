import java.util.Scanner;

public class rectangle_perimeter {
    public static void main(String[] args){
        Scanner peri = new Scanner(System.in);
        System.out.print("Please enter the length of the rectangle = ");
        int length = peri.nextInt();
        System.out.print("Please enter the breadth of the rectangle = ");
        int breadth = peri.nextInt();
        int perimter = 2*(length+breadth);

        System.out.println("The perimeter of the rectangle is " + perimter);
    }
}
