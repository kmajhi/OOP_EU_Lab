import java.util.Scanner;

class Practice {
    Practice(int x, int y, int z) {
        if (x + y + z == 180) {
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("Right Triangle");
            } else if (x < 90 && y < 90 && z < 90) {
                System.out.println("Acute Triangle");
            } else {
                System.out.println("Obtuse Triangle");
            }
        } else {
            System.out.println("These angles cannot form a triangle.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.print("Enter the first angle = ");
        x = sc.nextInt();
        System.out.print("Enter the second angle = ");
        y = sc.nextInt();
        System.out.print("Enter the third angle = ");
        z = sc.nextInt();

        Practice triangle = new Practice(x, y, z);
    }
}
