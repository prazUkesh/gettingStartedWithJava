import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class fileHandling {
public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    // writing to file
    while (1>0) {
        try {
            FileWriter Writer = new FileWriter("dataFile.txt", true);
            System.out.print("enter transaction type, amount and category: ");
            String transactionType = userInput.next();
            double transactionAmount  = userInput.nextInt();
            String transactionCategory = userInput.next();
            Writer.write("\n"+transactionType + "\t\tRs." + transactionAmount + "\t\t" +transactionCategory );
            Writer.close();
            userInput.close();
            System.out.println(transactionType + " " + transactionAmount + " " +transactionCategory +"\n");
        }
            catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        }
    }
    
}}

    // reading file 
   /*  while (1>0) {
        try {
            Scanner reader = new Scanner("dataFile.txt");

        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
        } catch (FileNotFoundException  e) {
            System.out.println("An error has occurred.");
        }
        
    }*/