public class Recursion {
    int n ;
   static int sum (int n){
        if(n>0){
            return n;
        }
        else 
        {
            return n + (n-1);
        }
    }
    public static void main () {
        Recursion.sum(3);
    }
}