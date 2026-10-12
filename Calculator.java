import java.util.Scanner;
public class Calculator{
    int a, b, c,d;
    public void add() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = a + b;
     System.out.println("sum of two numbers are "+
     sum);
    }
    public void mul() {
         Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        d = scanner.nextInt();
        System.out.println("multiplication of numbers is "+c * d);
    }
    public static void main(String[]args){
        Calculator calculate = new Calculator();
        calculate.add();
        calculate.mul();
    }
}