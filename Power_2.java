import java.util.Scanner;

public class Power_2{
    int num;
    void Power () {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int Pow = num % 2;
        if (Pow == 0){
            System.out.println("Number is power of 2");
        }
    }
    public static void main (String[] args) {
Power_2 obj = new Power_2();
obj.Power();
    }
}