public class Parent {
int  area ;
void method (){
    System.out.println(area);
}
}

public class Child extends Parent{
int side;
void perimeter(){
    System.out.println(side);
}

}

public class Bitwise extends child{
 int circle;
 void method1(){
    System.out.println(circle);
 }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
   Parent obj = new Parent();
   obj.method(5);
   obj.perimeter(6);
   obj.method1(2);
    }
    }