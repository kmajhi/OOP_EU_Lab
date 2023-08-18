import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String inputCharacter = sc.nextLine();
        
        /*
        To count characters without the spaces in the string, the below code can be used:
        String newLength = inputCharacter.replace(" ", "");
        System.out.println("The total number of characters in the string is: " + newLength.length());
        */
        
        System.out.println("The total number of characters in the string is: " + inputCharacter.length());
    }
}


//using getters and setters
/*

import java.util.Scanner;
class GetterAndSetter{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class Main {
    public static void main(String[] args) {
        GetterAndSetter name = new GetterAndSetter();
        System.out.print("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        name.setName(inputName);
        System.out.println();

        System.out.println("Name is, " + name.getName()+"\nThe total number of characters in the string is: "+ name.getName().length());


    }
}

*/
