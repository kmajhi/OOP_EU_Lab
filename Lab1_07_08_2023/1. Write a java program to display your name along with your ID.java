class Student{
    private String studentName1;
    private int studentID1;

    public String getStudentName1() {
        return studentName1;
    }

    public void setStudentName1(String studentName1) {
        this.studentName1 = studentName1;
    }

    public int getStudentID1() {
        return studentID1;
    }

    public void setStudentID1(int studentID1) {
        this.studentID1 = studentID1;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentName1("Sujon Mahamud");
        s.setStudentID1(123);
        String name = s.getStudentName1();
        int id = s.getStudentID1();

        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
    }
}
