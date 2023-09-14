import java.util.Scanner;

class Wednesday{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class practice {
    public static void main(String[] args) {

        Wednesday className = new Wednesday();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        className.setName(sc.nextLine());
        System.out.print("enter your id: ");
        className.setId(sc.nextInt());

        System.out.println("Name is: "+ className.getName());
        System.out.println("Id is: "+ className.getId());
    }
}
