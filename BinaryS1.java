public class BinaryS1{
    public static void main(String[] args){
        int [] arr = {3,9,4,6,9};
        int left =0;
        int right = 5-1;
        int mid = left+ right /2;

int target = 6;
        for(int i =0; i<=5; i++){
            if(target == arr[mid]){
                System.out.println("not found");
            }
            else if(target>arr[mid]){
             arr[right] = arr[right-1];
             left = arr[left+1];
             mid = arr[right-1] +  arr[left+1] / 2;
            }
        }
    }
}