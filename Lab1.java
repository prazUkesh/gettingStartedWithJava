import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter aradius of  circle");
        int radius = input.nextInt();

        input.close();
        double area = 3.14 * radius *radius;
        System.out.println("area of circle is: "+ area);       

    }
}
