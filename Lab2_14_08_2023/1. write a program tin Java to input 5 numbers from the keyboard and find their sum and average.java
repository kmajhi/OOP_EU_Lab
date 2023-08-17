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

//Another way

/* 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum;

        do {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter the number: ");
                int x = sc.nextInt();
                sum += x;
            }
            double average = (double) sum / 5;
            System.out.println("The sum of the 5 numbers is: " + sum);
            System.out.println("The average of the input numbers is: " + average);

            System.out.print("Do you want to continue (Y/N)? (1/2): ");
            inputNum = sc.nextInt();




            while (inputNum != 1 && inputNum != 2) {
                    System.out.println("Wrong input. Enter 1 to continue or 2 to exit");
                    System.out.print("Do you want to continue (Y/N)? (1/2): ");
                    inputNum = sc.nextInt();
            }

            if (inputNum == 2) {
                System.out.println("Thank you!");
                break;
            }

        } while (inputNum != 2);
    }
}

*/
