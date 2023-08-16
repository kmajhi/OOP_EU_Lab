import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        System.out.print("Enter the number: ");
        int inputNum = sc.nextInt();
        for (int i=1; i<=inputNum; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count+  " ");
                count++;
            }
            System.out.println();
        }
    }
}
