public class ReseseString {
  String name ="Nisha";
String result ="";
void Revese (){
    for (int i = 4; i<=0; i--){
        result = result + name ;
    }
    System.out.print(result);
}
public static void main(String[] args){
      ReseseString obj = new ReseseString();
      obj.Revese();
}
}