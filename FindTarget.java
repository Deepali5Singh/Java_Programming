import java.util.Scanner;

public class FindTarget{
    Scanner sc = new Scanner(System.in);
String  s;
String Target ;
int length  = 7;
void find (String s, String Target) {
     s = sc.nextLine();
     Target  = sc.nextLine();
for (int i = 0 ; i<7; i++)
{
if (s[i] == Target)
{
    System.out.println("Found");
}
}
}

    public static void main(String[] args){
        FindTarget dis = new FindTarget();
dis.find();
    }
}