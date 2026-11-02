public class CountWord {

public static void main (String[] args){
StringBuilder s1 = new StringBuilder("Hello, I am learning!");
int spaces = 0;
int l = s1.length();
for(int i = 0; i<l; i++){
    if(s1[i] ==' '){
     spaces = spaces + 1;
    }
}
}

}