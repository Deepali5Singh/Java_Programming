public class CharacterIn  {
    char name = '@';
    char sym = 65;
    void display () {
        System.out.println(name);
        System.out.println(sym);
    }
    public static void main (String[]args){
        CharacterIn obj = new CharacterIn();
        obj.display();
    }
}