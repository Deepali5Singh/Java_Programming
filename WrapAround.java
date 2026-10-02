public class WrapAround {
    int min_value = Integer.MIN_VALUE;
    int max_value = Integer.MAX_VALUE;
    public void  display (){
        System.out.println(min_value - 1);
        System.out.println(max_value + 1);
    }
    public static void main (String[]args){
        WrapAround obj = new WrapAround ();
        obj.display();
    }
}