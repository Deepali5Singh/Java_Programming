public class Variables {
    //variable declaration in java
    public void display (){
        //local variables
        int count = 5; // integer type varable 
        final double pi = 3.141; //this value  will not change
        boolean JavaFun = true;
        System.out.println("The count value is "+ count);
        System.out.println("The pi value is "+pi);
        System.out.println("The boolean value "+JavaFun);
    }
    public static void  main(String[] args) {
        //constructor
        Variables value = new Variables(); 
        value.display();
    }
}