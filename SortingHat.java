import java.util.Scanner;

public class SortingHat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts! Let the Sorting Hate choose your house.");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Answer the following questions with 'yes' or 'no': ");

        System.out.print("Do you value bravey and chivarly? ");
        String answer = scan.nextLine();
        if (answer.equals("no")) {
            System.out.println("Do you value hard work, dedication, and loyalty? ");
        } else if (answer.equals("yes")) {
            System.out.println("\n\nDear " + name + " \nYou belong to Griffindor");
        }

        String answer1 = scan.nextLine();

        if (answer1.equals("no")) {
            System.out.println("Do you value intelligence, creativity, and learning?");}
        else if (answer1.equals("yes")) {System.out.println("\n\nDear " + name + " \nYou belong to Ravenclaw");}

        String answer2 = scan.nextLine();

        if (answer2.equals("yes")) {
            System.out.println("\n\nDear " + name + " \nYou belong to Ravenclaw");
        } else if (answer2.equals("no")) {
            System.out.println("\n\nDear " + name + " \nYou belong to Slytherin");
        }
    }
}