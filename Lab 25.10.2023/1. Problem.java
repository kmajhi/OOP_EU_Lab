import java.util.Scanner;

class Triangle {
    int x, y, z;

    Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void checkTriangle() {
        if ((x + y + z) == 180) {
            System.out.println("Valid triangle:");
        } else {
            System.out.println("Not a triangle.");
            return;
        }
    }
}

class Right extends Triangle {
    Right(int x, int y, int z) {
        super(x, y, z);
    }

    void checkTriangle() {
        super.checkTriangle();
        if (x == 90 || y == 90 || z == 90) {
            System.out.println("Right Triangle");
        }
    }
}

class Acute extends Triangle {
    Acute(int x, int y, int z) {
        super(x, y, z);
    }

    void checkTriangle() {
        super.checkTriangle();
        if (x < 90 && y < 90 && z < 90) {
            System.out.println("Acute Triangle");
        }
    }
}

class Obtuse extends Triangle {
    Obtuse(int x, int y, int z) {
        super(x, y, z);
    }

    void checkTriangle() {
        super.checkTriangle();
        if (x > 90 && x < 180 || y > 90 && y < 180 || z > 90 && z < 180) {
            System.out.println("Obtuse Triangle");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.print("Enter the first angle = ");
        x = sc.nextInt();
        System.out.print("Enter the second angle = ");
        y = sc.nextInt();
        System.out.print("Enter the third angle = ");
        z = sc.nextInt();

        Right rightTriangle = new Right(x, y, z);
        rightTriangle.checkTriangle();

        Acute acuteTriangle = new Acute(x, y, z);
        acuteTriangle.checkTriangle();

        Obtuse obtuseTriangle = new Obtuse(x, y, z);
        obtuseTriangle.checkTriangle();
    }
}
