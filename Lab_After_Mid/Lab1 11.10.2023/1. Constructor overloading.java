package overloading;

class OverLoading{
    OverLoading(int id){
        System.out.println("The user entered id= "+ id);
    }
    OverLoading(int id1, int id2){
        System.out.println("The user entered id = "+ id1 + " & "+ id2);
    }
    OverLoading(String name){
        System.out.println("The user entered name = "+ name);
    }
    OverLoading(String name1, String name2){
        System.out.println("The user entered names = "+ name1 + " & "+ name2);
    }
}

public class Java {
    public static void main(String[] args) {
        OverLoading constructorOverLoadingNames = new OverLoading("John Travolta", "Nick Fury");
        OverLoading idProvided = new OverLoading(69, 420);
    }
}
