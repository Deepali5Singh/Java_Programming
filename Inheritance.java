 class Hide{
String n = "hide";
public void display (){
    System.out.println(n);
}

}

class Seek extends Hide {
    String v = "Seek";
    public void show(){
 System.out.println(n+ " "+v);
    }

    

}

 

public class Inheritance{
      public static void main(String[] args){
       Seek obj = new Seek();
        obj.display();
        obj.show();
    }
   
}


