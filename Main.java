import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ScannerIn = new Scanner(System.in);

        System.out.println("Hello :) I am Balaculator, terminal calculator.");
        System.out.println("What is your name?");
        String name = ScannerIn.nextLine();

        System.out.println("Nice to meet you " + name + ". What you want to do ?");
        System.out.println("Select an option (1, 2, 3, 4) \n1 (+)addition\n2 (-)subtraction\n3 (*)multiplication\n4 (/)division");
        int choice = ScannerIn.nextInt();

        System.out.println("Give me first number");
        int firstNumber = ScannerIn.nextInt();
        System.out.println("Give me second number");
        int secondNumber = ScannerIn.nextInt();

        switch(choice){
            case 1: System.out.println("Your result " + firstNumber + " + " + secondNumber + " is " + (firstNumber+secondNumber));
                break;
            case 2: System.out.println("Your result " + firstNumber + " - " + secondNumber + " is " + (firstNumber-secondNumber));
                break;
            case 3: System.out.println("Your result " + firstNumber + " * " + secondNumber + " is " + (firstNumber*secondNumber));
                break;
            case 4: System.out.println("Your result " + firstNumber + " / " + secondNumber + " is " + (firstNumber/secondNumber));
                break;
        }
    }
}
