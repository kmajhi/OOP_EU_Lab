import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String inputCharacter = sc.nextLine();
        System.out.println("The total number of characters in the string is: " + inputCharacter.length());
    }
}
