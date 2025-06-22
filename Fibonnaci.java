import java.util.*;
class Main{
    static int fibonacci(int n){
        int first=0,second=1;
        int next=0;
        System.out.print(first+" "+second);
        for(int i=2;i<=n;i++){
             next=first+second;
             System.out.print(" "+next);
            first=second;
             second=next;
        }  
        return next;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fibonacci(n);

    }
}
