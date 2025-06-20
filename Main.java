import java.util.*;

class Main {
    static void karp(int n) {
        if(n==1){
            System.out.println("Karprekar");
            return;
        }
        int square = n * n;
        int temp=square;
        int pow=1;
        while(temp>0){
            pow*=10;
            int left=square/pow;
            int right=square%pow;
        if(right>0 &&(left+right==n)){
            System.out.println(n+" karprekar");
            return;}
        temp/=10;}
        
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Main obj = new Main();
        obj.karp(n);
    }
}
