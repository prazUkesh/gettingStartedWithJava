import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;

public class ET {
    public static void main(String[] args){
        loadingScreen();
    }

    static void loadingScreen(){
        Scanner userInput= new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Record Income/Expense \n2) View Transactions\n3) Print Statements\n4) exit\nEnter your choice: ");
            int userChoice = userInput.nextInt();

        switch (userChoice) {
            case 1:
                recordTransaction();
                break;

            case 2:
                System.out.println("you a broke, get a job ni**a");
                readTransaction();
                break;
            case 3:
                System.out.println("you're in debt ni**a");
                break;
        
            default:
                System.out.println("gtfo ret*rd");
                break;
        }
        userInput.close();
        }
    }

    static void recordTransaction(){
        Scanner userInput = new Scanner(System.in);
        while (true) {
            try {
                FileWriter Writer = new FileWriter("dataFile.txt", true);

                System.out.print("enter transaction type, amount and category: ");
            String transactionType = userInput.next();
            double transactionAmount  = userInput.nextInt();
            String transactionCategory = userInput.next();
            Writer.write("\n"+transactionType + "\t\tRs." + transactionAmount + "\t\t" +transactionCategory );
            Writer.close();
            
            System.out.println(transactionType + " " + transactionAmount + " " +transactionCategory +"\n");

            userInput.close();
            }
            catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
            }
            
        }


        static void readTransaction(){
            File existingFile = new File("dataFile.txt");

           try{
            Scanner fileReader = new Scanner(existingFile);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();
           }
           catch (FileNotFoundException e) {
            // Handle the case where the file does not exist
            System.out.println("The file was not found.");
            e.printStackTrace();
        }

        }

    }

