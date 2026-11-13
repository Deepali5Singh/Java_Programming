public class CalculatorIn{
    static int sum(int a, int b) {
     int sum = a + b;
     return sum;
    }
    static void diff(){
        int c= 5;
        int d =6;
        System.out.println(c-d);
    }
    static int mul(){
        int x = 6, y =5;
        return x * y;
    }
    static void div (int e, int f){
System.out.println(e/f);
    }
    public static void main(String[]args)
    {
     sum(4,5);
    diff();
    mul();
    div(9,8);

    }
}