import java.util.Scanner;

public class main {
    public static void main(String[] args){
      System.out.println("baaaaaaaaaaaa");
       Scanner  userInput =  new Scanner(System.in);

       System.out.print("enter name: ");
       String userName = userInput.next();

       System.out.println("enter your age");
       int age = userInput.nextInt();


      userInput.close();

       System.out.println(userName+ " " + age);
        }
      }