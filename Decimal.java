public class Decimal {
    // decimal datatype concept in java
    // float percentage = 94.5; it will give error because by default compiler take this value as a double
    float percentage = 94.5f; 
    public void display (){
        System.out.println(percentage);
    }
    public static void main (String[]args)
    {
        Decimal obj = new Decimal();
        obj.display();
    } 
}