public class VariableLearn {
// uses of different data types in java
void  display (){
    // integer datatype for different ranges
    byte value = 100; // stores value 128 to -127 // 4 bytes
    short area = 1000; // 32768 to -32767
    int  Economy =10000000; //214748364 to -214748363
    long   Population = 1000000000; // 2^64 TO -2^64 - 1
    System.out.println(value);
    System.out.println(area);
    System.out.println(Economy);
    System.out.print(Population);
}
public static void main (String[] args){
    //constructor
    VariableLearn obj = new VariableLearn();
    obj.display();
}
}