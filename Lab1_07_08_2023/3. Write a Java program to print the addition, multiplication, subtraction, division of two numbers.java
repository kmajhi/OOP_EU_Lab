//Write a Java program to print the addition, multiplication, subtraction, division of two numbers.

import java.util.Scanner;

class Operator{
    private float num1;
    private float num2;
    private float addition;
    private float multiplication;
    private float substraction;
    private float division;

    public float getAddition() {
        return addition;
    }

    public void setAddition() {
        this.addition = num1+num2;
    }

    public float getMultiplication() {
        return multiplication;
    }

    public void setMultiplication() {
        this.multiplication = num1*num2;
    }

    public float getSubstraction() {
        return substraction;
    }

    public void setSubstraction() {
        this.substraction = num1-num2;
    }

    public float getDivision() {
        return division;
    }

    public void setDivision() {
        this.division = num1/num2;
    }


    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
public class Main {
    public static void main(String[] args) {
        Operator op = new Operator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        op.setNum1(sc.nextFloat());
        System.out.print("Enter the second number: ");
        op.setNum2(sc.nextFloat());
        op.getNum1();
        op.getNum2();


        op.setAddition();
        op.setMultiplication();
        op.setSubstraction();
        op.setDivision();

        float addition = op.getAddition();
        float multiplication = op.getMultiplication();
        float substraction = op.getSubstraction();
        float division = op.getDivision();

        System.out.println("Addition: " +op.getNum1()+" + "+ op.getNum2()+" = "+addition);
        System.out.println("Multiplication: " +op.getNum1()+" x "+ op.getNum2()+" = "+multiplication);
        System.out.println("Substraction: " +op.getNum1()+" - "+ op.getNum2()+" = "+substraction);
        System.out.println("Division: " +op.getNum1()+" / "+ op.getNum2()+" = "+division);
    }
}
