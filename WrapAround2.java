public class WrapAround2 {
    short min =  Short.MIN_VALUE;
    short max = Short.MAX_VALUE;
public void display (){
    short a = (Short)(min + 1);
    System.out.println(min);
}
public static void main (String[]args){
    WrapAround2 obj = new WrapAround2();
    obj.display();
}
}