
public  class Student {
String name ;
int age ;
public void Info(){
    System.out.println(this.name);
    System.out.println(this.age);
}
 Student(String name, int age){
  this.name = name;
  this.age = age;
 }

}
public class OOP {
public static void main(String[] args){
    Student info = new Student ("vihan", 25);
    info.Info();
}

}
