public class Control {
    int a = 5;
    int b = 10;
    public void Comparison () {
        if(b>a) {
            System.out.println("b value is greater than a");
        }
    }
    public static void main(String[]args){
        Control Obj = new Control();
        Obj.Comparison();
    }

}