public class Append {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("Jenny Khatri");
        s1.append(1234567890);
        s1.insert(5, "java");
        System.out.println(s1);
        System.out.println(s1.capacity());
        // for (int i =0; i<50; i++){
        //     s1.append(i);
        //     System.out.println(s1);
        // }
       
    }
}