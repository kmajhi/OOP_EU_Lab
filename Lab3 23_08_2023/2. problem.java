import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the month: ");
        String monthName = scanner.nextLine().toUpperCase();

        int daysInMonth = -1;

        switch (monthName) {
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                daysInMonth = 31;
                break;
            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                daysInMonth = 30;
                break;
            case "FEBRUARY":
                daysInMonth = 28;
                break;
        }

        if (daysInMonth != -1) {
            System.out.println("Number of days in " + monthName + ": " + daysInMonth);
        } else {
            System.out.println("Invalid month name entered.");
        }
    }
}
