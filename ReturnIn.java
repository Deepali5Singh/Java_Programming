public class ReturnIn {
    static String display(){
boolean ismorning = true;
if(ismorning){
    return "GoodMorning";
}
else{
    return "Hare Krishna";
}
    }
    public static void main (String[]args){
    String result = display();
System.out.println(result);
    }
}