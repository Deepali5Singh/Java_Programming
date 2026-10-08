public class booleanDemo {
    boolean isJavaFun = true;
    boolean isCodingEasy = false;
    public void display () {
        System.out.println(isJavaFun);
        System.out.println(isCodingEasy);
    }
    public static void main (String[]args){
        booleanDemo obj = new booleanDemo();
        obj.display();
    }
}