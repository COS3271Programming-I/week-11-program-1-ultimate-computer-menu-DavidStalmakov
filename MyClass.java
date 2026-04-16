package projectdavid;
import java.util.Scanner;

///// Ultimate Computer Menu
public class MyClass {

    static Scanner userinput = new Scanner(System.in);
    
    public static void main(String[] args) {
    	int choice;
        do {
            displayMenu();
            choice = getValidChoice();
            switch (choice) {
            case 1:
                displayApp();
                break;
            case 2:
                textArtApp();
                break;
            case 3:
                calculatorApp();
                break;
            case 4:
                binaryCalculatorApp();
                break;
            case 5:
                encouragementApp();
                break;
            case 6:
                diceApp();
                break;
            case 7:
                oppishApp();
                break;
            case 8:
                fibonacciApp();
                break;
            case 9:
                doubleFactorialApp();
                break;
            case 0:
                System.out.println("Program ended");
                break;
        }

    } while (choice != 0);
}


    public static void displayMenu() {
    	System.out.println("\n ULTIMATE COMPUTER MENU");
        System.out.println("1. Display App");
        System.out.println("2. Text Art App");
        System.out.println("3. Calculator App");
        System.out.println("4. Binary Calculator App");
        System.out.println("5. Encouragement App");
        System.out.println("6. Dice App");
        System.out.println("7. Oppish App");
        System.out.println("8. Fibonacci App");
        System.out.println("9. Double Factorial App");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
    public static int getValidChoice() {
        while (!userinput.hasNextInt()) {
            System.out.print("Invalid input. Enter a number 0–9: ");
            userinput.next();
    }
        int choice = userinput.nextInt();

        while (choice < 0 || choice > 9) {
            System.out.print("Please enter a number between 0 and 9: ");
            while (!userinput.hasNextInt()) {
                System.out.print("Invalid input. Enter a number 0–9: ");
                userinput.next();
            }
            choice = userinput.nextInt();
        }

        return choice;
    }

    public static void displayApp() {
        System.out.println("Display App selected.");
    }

    public static void textArtApp() {
        System.out.println("Text Art App selected.");
    }

    public static void calculatorApp() {
        System.out.println("Calculator App selected.");
    }

    public static void binaryCalculatorApp() {
        System.out.println("Binary Calculator App selected.");
    }

    public static void encouragementApp() {
        System.out.println("Encouragement App selected.");
    }

    public static void diceApp() {
        System.out.println("Dice App selected.");
    }

    public static void oppishApp() {
        System.out.println("Oppish App selected.");
    }

    public static void fibonacciApp() {
        System.out.println("Fibonacci App selected.");
    }

    public static void doubleFactorialApp() {
        System.out.println("Double Factorial App selected.");
    }
} 
    
    