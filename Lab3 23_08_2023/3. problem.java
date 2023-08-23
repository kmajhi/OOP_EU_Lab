import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            int num = sc.nextInt();
            numbers.add(num);
        }

        Collections.sort(numbers);
        int secondLargest = numbers.get(1);

        System.out.println("The second largest number is: " + secondLargest);
    }
}
