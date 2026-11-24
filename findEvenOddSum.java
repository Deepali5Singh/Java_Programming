public class findEvenOddSum {
    public static void main(String[] args){
        int [] arr = {3,4,7,8,9};
        int evenSum =0;
        int oddSum =0;
        for(int i =0; i<5; i++){
            if(arr[i] % 2 == 0){
                evenSum = evenSum + arr[i];
            }
            else{
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}