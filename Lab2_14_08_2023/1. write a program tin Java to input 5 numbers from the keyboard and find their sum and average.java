import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        float num;
        float sum = 0;
        float average=0;
        System.out.println("Enter the ");
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=5; i++){
            System.out.print("Enter the number  = ");
            num = sc.nextFloat();
             sum = sum + num;
             average = sum/5;
        }

            System.out.println("Sum: " + sum);
            System.out.println("Average : "+average);
    }
}
