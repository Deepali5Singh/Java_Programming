public class MethoOverloading2{
    int a ;
    int b ;// the ambitious method 
    double c ;
    double d;
    void sum (int a, double c ){
        System.out.println(a+b);
    }
    void sum (int b, double d){
         System.out.println(b+d);
    }
    public static void main(String[] args){
        MethoOverloading2 obj = new MethoOverloading2();
        obj.sum(4,1);
    }
}