public class BuilderIntro {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i<50; i++){
         s1 = s1.append(i);
         System.out.println(s1);
        }
    }
}