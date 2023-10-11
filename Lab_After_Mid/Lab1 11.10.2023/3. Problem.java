public class CheckRectangle {
    CheckRectangle(int x){
        System.out.println("This is a square");
    }
    CheckRectangle(int a, int b, int c, int d){
        System.out.println("It is a simple rectangle.");
    }

    public static void main(String[] args) {
        CheckRectangle verify = new CheckRectangle(3,3,3,3);
    }
}
