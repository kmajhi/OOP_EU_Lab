import java.util.Scanner;

class Wednesday{
    int Employee_id;
    String Employee_name;
    int salary;

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.Employee_name = employee_name;
    }

    public int getSalary() {
        if (salary < 50000 && 80000 >= 60) {
            throw new IllegalArgumentException("The salary is out of range");
        } else{
            return salary;
        }

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wednesday name = new Wednesday();

        System.out.print("Enter the name: ");
        name.setEmployee_name(sc.nextLine());
        System.out.print("Enter the ID: ");
        name.setEmployee_id(sc.nextInt());
        System.out.print("Enter the Salary of the Employee: ");
        name.setSalary(sc.nextInt());

        System.out.println("The name of the Employee is: "+ name.getEmployee_name());
        System.out.println("The id of the employee is: "+ name.getEmployee_id());
        System.out.println("The salary of the employee is: "+ name.getSalary());
    }
}
