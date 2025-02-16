import java.util.*;
import java.io.File;

public class expenseTracker {
 public static void main(String[] args){
File myFile = new File("expenseTracker.txt");
    
    // scanner for userInput
    Scanner scanner = new Scanner(System.in);
    double userBalance = 0.00d;
    
    System.err.println("Welcome user: \ncurrent balance: Rs."+ userBalance);
    System.out.println("1) Record Income/Expense \n2) View Balance\n3) Print Statements\n4) exit\nEnter your choice: ");
    int userChoice = scanner.nextInt();
    
    switch (userChoice) {
        case 1:
            // taking user input through commandline
            inputRecorder(userBalance);
           
            //file handling code here


            ///inputRecorder(double userBalance);
            break;
        case 2:
            balanceChecker();
            break;
        case 3:
            statementPrinter();
            break;
        default:
            break;
    }
    scanner.close();
 }   

static void inputRecorder(double userBalance){
System.out.println("enter income/expense: ");

}
static void balanceChecker(){
    System.out.println("your're broke, get a job: ");
}
static void statementPrinter(){
    System.out.println("get a job: ");
}
}
