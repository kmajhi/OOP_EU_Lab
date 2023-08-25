import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name = ");
            String name = sc.nextLine();
            System.out.println("Entered name is: " + name);

            int inputNumber;
            do {
                System.out.print("Do you want to continue? (1 for Yes / 2 for exit): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine();
                }
                inputNumber = sc.nextInt();
                sc.nextLine();

                if (inputNumber == 1) {
                    break;
                } else if (inputNumber == 2) {
                    System.out.println("Question test passed. Thanks for coding.");
                    sc.close();
                    return;
                } else {
                    System.out.println("Invalid input. Please enter 1 to continue or 2 to exit.");
                }
            } while (true);
        }
    }
} 
