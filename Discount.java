public class Discount 
{
    int age = 50;
    public void IsEligible() {   
         if (age >= 45){
            System.out.println("you are eligible for discount");
        } 
        else {
            System.out.println("You are eligible");
        } 
    }
    public void main (String[]args){
        Discount Obj = new Discount();
        Obj.IsEligible();
    }

}