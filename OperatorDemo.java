public class OperatorDemo{
    int a = 4;
    int b = 6;
    public void airth () {
        int sum = a+b;
        int sub = b - a;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println(sum);
         System.out.println(sub);
          System.out.println(mul);
           System.out.println(div);
            System.out.println(rem);
    }
    public static void main () {
        OperatorDemo Obj = new OperatorDemo();
        Obj.airth();
    }
}