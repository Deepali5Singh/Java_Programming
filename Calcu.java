import java.util.*;
public class Calcu{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        int backlog =sc.nextInt();
        if(percentage>=60 && backlog == 0){
            System.out.print("Eligibel");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}