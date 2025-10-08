import calculator.CalculatorImp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter 1st Number: ");
         double n1=sc.nextDouble();

        System.out.println("Enter Operator(+ , - , * , /): ");
        char op=sc.next().charAt(0);

        System.out.println("Enter 2nd Number: ");
        double n2=sc.nextDouble();


        CalculatorImp ci=new CalculatorImp();
        if(op=='+'){
            System.out.println(ci.add(n1,n2));
        } else if (op=='-') {
            System.out.println(ci.substract(n1,n2));
        } else if (op=='*') {
            System.out.println(ci.multiply(n1,n2));
        } else if (op=='/') {
            System.out.println(ci.division(n1,n2));
        }
    }
}
