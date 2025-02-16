import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter character: ");
        char ch = input.next().charAt(0); 
        switch (ch) {
            case "a":
                System.out.println("vowel");
                break;
            case "e":
                System.out.println("vowel");
                break;
            case "i":
                System.out.println("vowel");
                break;
            case "o":
                System.out.println("vowel");
                break;
            case "u":
                System.out.println("vowel");
                break;
        
        
            default:
            System.out.println("consonant");
                break;
        }
        
        
    }
}