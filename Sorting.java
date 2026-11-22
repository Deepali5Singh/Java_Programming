public class Sorting {
    public static void main(String[]args){
        int i , j;
int[] sort = {7,8,3,2,1};
for( i =0 ; i<sort.length-1; i++){
    for( j = 0; j<sort.length-1-i; j++){
        int tem = sort[j];
        if(sort[j]<sort[j+1]){
            tem = sort[j+1];
            sort[j] = tem;
        }
    }
    System.out.println(sort[j]);
}
    }
}