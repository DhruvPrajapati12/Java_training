package day2_02_04_22;
import java.util.Scanner;


public class Calcmain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();
        sc.close();
        Calculator c = new Calculator();
        
        System.out.println(c.add(a, b));
        System.out.println(c.sub(a, b));
        System.out.println(c.multi(a, b));
        System.out.println(c.div(a, b));

        // Calculator.Calculator1 calc2 = new Calculator.Calculator1();
    }
}
