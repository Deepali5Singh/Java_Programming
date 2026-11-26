public class ternary {
    public static void main (String[] args) {
      int  num = 20;
    String res = (num %2 == 0) ? "Even" : "Odd";
System.out.println(res);
int marks = 32;
String res1 = (marks >= 35) ? "Pass" : "Fail";
System.out.println(res1);
int age = 19;
String res2 = (age >= 18) ? "Eligible for vote" : "Not eligible for vote";
System.out.println(res2);
int a = 45;
int b = 67;
String res3 = (a>b)?  a +" A is grater" : b +" b is greater";
System.out.println(res3);
 a =  89;
 b = 56;
 String res4 = (a < b) ? a + "a  is smaller " : b + " b is smaller";
 System.out.println(res4);
 num = -15;
String res5 = (num> 0) ? "postive" : "negative";
System.err.println(res5);
num = 0;
String res6 = (num == 0) ? "zero" : "non zero";
System.err.println(res6);
 marks = 85;
String res7 = (num == 0) ? "zero" : "non zero";
boolean login = true;
String res8 = (login == true) ? "Status: Welocme" : "Status: Please Login";

    }
}
