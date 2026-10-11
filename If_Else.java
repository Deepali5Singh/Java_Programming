import java.util.Scanner;
public class If_Else {
    static int a ;
    static int b ;
    public static void main (String[]args){
        If_Else Obj = new If_Else();
     Scanner scanner = new Scanner(System.in);
     a = scanner.nextInt();
     b = scanner.nextInt();
     if (a > b) {
        System.out.println("A is greater than B");
     }
     else{
        System.out.println("B is greater than A");
     }
    }
}