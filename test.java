
import java.io.File;
import java.io.IOException;
import java.util.*;

public class test {
    public static void main(String[] args){
        loadingScreen();
    }
    static void loadingScreen(){
        Scanner userInput = new Scanner(System.in);

        while (1>0) {
            System.out.println("1) Record Income/Expense \n2) View Balance\n3) Print Statements\n4) exit\nEnter your choice: ");
        int userChoice = userInput.nextInt();
        

        switch (userChoice) {
            case 1:
                recordTransaction();
                break;
        
            default:
                break;
        }
    }
    } 
    static void recordTransaction(){
        Scanner userInput = new Scanner(System.in);

        System.err.println("Enter Transaction type, Amount & Category of Transaction\n");
        String transactionType = userInput.next();
        double transactionAmount = userInput.nextDouble();
        String transactionCategory = userInput.next();

        System.out.println("Transaction Details:\nTransaction Type: "+ transactionType + "\nTransaction Amount: Rs."+transactionAmount+"\nTransaction Category: "+transactionCategory);
        
        
    }
}
