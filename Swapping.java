public class Swapping{
    public static void main (String[]args){
int a = 5;
int b = 10;
int tem = a;
// a =    a^ b;
// b = a ^ b;
// a =    a^ b;
// a += 5;
// b -=5;

a =b;
b = tem;

System.out.println(a);

System.out.print(b);
    }
}