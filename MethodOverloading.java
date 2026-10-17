public class MethodOverloading { //today 
     int a;
     int b;
     int c ;
     int d;
     static void sum (int a, int b){
        System.out.println(a + b);
     }
     static void sum (int b, int c){
        System.out.println(b * c);
     }
     static void sum (int c, int b){
        System.out.println(c - b);
     }
     public static void main (String[] args)
     {
       sum(4,5);
       sum(2,5);
       sum(9,2);
     }
}