public class Car {
    String Model ;
    int year;
    String color;
    public void dispaly () {
        System.out.println("The  model is"+ Model + "the car model year" + year +"The color is"+color);
    }
    public void accerlrate () {
        int acc = 20;
        System.out.println(acc);
    }
    public void brake () {
int  brakeUsed = 10;
 System.out.println(brakeUsed);
    }
    public void get_speed () {
int speed = 180;
System.out.println(speed);
    }
     public static void main(String[]  args){
        Car obj =   new Car();
        obj.Model = "Ferrari";
        obj.year = 2019;
        obj.color = "Red";
        obj.dispaly();
        obj.accerlrate();
        obj.brake();
        obj.get_speed();
    }
}


