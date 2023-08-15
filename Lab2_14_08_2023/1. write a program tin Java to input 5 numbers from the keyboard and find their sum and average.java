import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choiceInput;
        Scanner sc = new Scanner(System.in);

        do {
            float num;
            float sum = 0;
            float average = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter the number = ");
                num = sc.nextFloat();
                sum = sum + num;
                average = sum /i;
            }

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

            do {
                System.out.print("Do you want to continue? (1=Yes, 2=Exit): ");
                choiceInput = sc.nextInt();
                if (choiceInput != 1 && choiceInput != 2) {
                    System.out.println("Invalid input. Please enter 1 to continue or 2 to exit.");
                }
            } while (choiceInput != 1 && choiceInput != 2);

        } while (choiceInput == 1);

        sc.close();
    }
}
