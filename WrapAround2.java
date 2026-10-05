public class WrapAround2 {
    short min =  Short.MIN_VALUE;
    short max = Short.MAX_VALUE;
public void display (){
    //Explicit conversion int to short
    short a = (short)(min + 1);
    System.out.println(min);
}
public static void main (String[]args){
    WrapAround2 obj = new WrapAround2();
    obj.display();
}
}