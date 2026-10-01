public class IntroWrapper{
    int min_value = Integer.MIN_VALUE;
    int max_value = Integer.MAX_VALUE;
    public void display (){
        System.out.println(min_value);
        System.out.println(max_value);
    }
    public static void main (String[]args){
        IntroWrapper obj = new IntroWrapper();
        obj.display();
    }
}