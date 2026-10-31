public class EvenOdd{
    static int[] arr = {11, 12, 18, 7, 56}; // static keyword accessissble by every class memeber
  static int even = 0;// 
  static int  odd = 0;
    public static void main (String[] args){
for (int i = 0 ; i<5; i++){
if(arr[i] %2 == 0){
    even = arr[i] -1;
    arr[i] = even;

}
else{
    odd = arr[i] + 1;
    arr[i] = odd;
}

}

for (int i = 0; i<5; i++){
    System.out.println(arr[i]);
}
    }
}