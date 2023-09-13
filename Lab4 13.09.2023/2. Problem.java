import java.util.Scanner;

class Odd{
    public int getOdd() {
        return odd;
    }

    int odd;
    public void setOdd(int odd) {
        if (odd%2!=0){
            this.odd = odd;
        } else{
            throw new IllegalArgumentException("Not odd");
        }
    }
}
public class Another2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Odd newOdd = new Odd();

        newOdd.setOdd(sc.nextInt());
        System.out.println("ODD number is: "+ newOdd.getOdd());

    }
}

