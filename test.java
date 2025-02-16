import java.util.*;
import java.io.File;
   

public class test {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        loadingScreen();
    }
    static void loadingScreen(){

        while (1>0) {
            
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
