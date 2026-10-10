public class Check {
    int num = 5;
    public void CheckNum () {
        if(num > 0){
            System.out.println("Number is positive");
        }
    }
    public static void main (String[]args)
    {
    Check Obj = new Check();
    Obj.CheckNum();
    }
}