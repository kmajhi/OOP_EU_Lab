public class Bird {
    Bird(){
        System.out.println("Unknown");
    }
    Bird(String name){
        System.out.println("Name = "+ name);
    }
    Bird(String name1, String name2){
        System.out.println("Name = "+ name1 + " & "+ name2);
    }
    Bird(String name1, String name2, String name3){
        System.out.println("Name = "+ name1 + " & "+ name2 + " & "+ name3);
    }

    public static void main(String[] args) {
        Bird name = new Bird("Bird1");
    }
}


