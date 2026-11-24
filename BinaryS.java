import java.util.*;
public class BinaryS {
    public static void main(String[]args){
        int [] arr = {23,32,45,56,65}; //{56,65,32,23,45};
        int l =0;
        int r = 4;
        int mid = l+r/2;
       Scanner sc = new Scanner(System.in);
       int target = sc.nextInt();
    //    int flag = 0;
     while(l<r)
     
if(target == mid){

System.out.println(mid);
    // flag = 1;
}
else if(target>mid){
    r = mid -1;
}
else{
    l = mid + 1;
}
       }
    //    if(flag ==0){
    //     System.out.println("Target not found");
    //    }
    }
