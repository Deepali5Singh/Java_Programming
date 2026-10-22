public class Ambi{
    String name;
    String section;
    void display (String name){
        System.out.println(name);
    }
    void display (String section, String name){
         System.out.println(section + name);
    }
    public static void main (String[] args) {
     Ambi obj = new Ambi();
     obj.display(name:null);
    }
}