import java.util.Scanner;

public class expenseTracker {
 public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    double userBalance = 0.00d;
    
    System.err.println("Welcome user: \ncurrent balance: Rs."+ userBalance);
    System.out.println("1) Record Income/Expense \n2) View Balance\n3) Print Statements\n4) exit\nEnter your choice: ");
    int userChoice = scanner.nextInt();
    
    switch (userChoice) {
        case 1:
            
            System.out.println("enter cash type, amount and category: ");
            String cashType = scanner.next();
            double amount = scanner.nextDouble();
            String catergory = scanner.next();
            System.err.println("cash type: "+ cashType + "\nAmount: "+amount+"\nCategory: "+catergory);
           

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
