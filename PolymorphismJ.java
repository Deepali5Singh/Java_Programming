public class PolymorphismJ { // compile time polymorphism

int age ; // method oveloading
String name ;
static public void info ( int age) {
    System.out.println(age);
}

static public void info (String name) {
    System.out.println(name);
}


public static void main (String[] args){
      info(25);
    info("Somaya");

}
}