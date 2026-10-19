//performing single level of inheritance 
class Student{ // Super class 
String name;
int rollNo;
void show () {
    name = "Arun";
    rollNo =21;
    System.out.println(name);
    System.out.println(rollNo);
}
}

class info extends Student { // subclass
    int age = 10;
    int Class = 5; 
    void infor(){
         System.out.println(age);
         System.out.println(Class);
    }
}

public class Inheritance2{ // m
   public static void main(String[] args){
     info s1 = new info();
     s1.show();
     s1.infor();
   }
}