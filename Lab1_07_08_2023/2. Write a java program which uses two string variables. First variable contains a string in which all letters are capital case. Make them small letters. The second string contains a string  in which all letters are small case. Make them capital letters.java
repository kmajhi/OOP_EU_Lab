class Case1{
    private String str1;
    private String str2;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

}

public class Main {
    public static void main(String[] args) {
        Case1 c1 = new Case1();
        c1.setStr1("XYZ");
        c1.setStr2("xyz");

        String string1 = c1.getStr1().toLowerCase();
        String string2 = c1.getStr2().toUpperCase();

        System.out.println(string1);
        System.out.println(string2);

    }
}
