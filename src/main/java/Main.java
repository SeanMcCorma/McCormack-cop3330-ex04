import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scan.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scan.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = scan.nextLine();
        System.out.println("Do you " + verb + " your " + adjective+ " " +noun+" "+ adverb+"? That's hilarious!");

    }

}
