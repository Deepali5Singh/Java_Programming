public class WaysForChar {
    char value = 65;
    char value2 = 'A';
    char value3 = '\u0023';
    char minValue = Character.MINVALUE;
    char a = (char)(minValue-1);
    public void display () {
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
         System.out.println(a);//typcasting 
    }
    public static void main () {
        WaysForChar obj = new WaysForChar();
        obj.display();
    }
}