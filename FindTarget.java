import java.util.Scanner;

public class FindTarget{
Scanner sc = new Scanner(System.in);
String  s;
String Target ;
int length  = 7;
void find (String s, String Target) {
     s = sc.nextLine();
     int n= s.length();
     Target  = sc.nextLine(); // .charAt(i) is predefined method to travese the string;

for (int i = 0; i<n; i++){
char str = s.charAt(i);  // .charAt(i) is predefined method to travese;
System.out.println(str);
}
}

    public static void main(String[] args){
        FindTarget dis = new FindTarget();
               dis.find();
    }
}