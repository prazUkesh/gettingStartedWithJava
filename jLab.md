```
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
```

```
import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3nums: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();
        int sumOfCubes =a*a*a +b*b*b + c*c*c  ;
        System.out.println("sum of cubes is: "+ sumOfCubes);       

    }
}
```

```
import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to check odd or even: ");
        int a = input.nextInt();
        

        input.close();
        if(a%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }       

    }
}   

```

```
import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3nums: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();
        if(a> b && a>c){
            System.out.println(a + " is greater");
        } else if(a< b && b> c){
            System.out.println(b + "is greater");
        }else{
            System.out.println(c+ "is greater");
        }
    }
}
```

```

```