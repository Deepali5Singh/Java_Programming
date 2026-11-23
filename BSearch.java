import java.util.*;
public class BSearch {
    public static void main(String[]args){
        int [] arr = {56,65,32,23,45};
       Scanner sc = new Scanner(System.in);
       int target = sc.nextInt();
       int flag = 0;
       for(int i = 0; i<5; i++ ){
if(arr[i] == target){
    System.out.println("Target found at : 23" + i + " index");
    flag = 1;
}
       }
       if(flag ==0){
        System.out.println("Target not found");
       }
    }
}