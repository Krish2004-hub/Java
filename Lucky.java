import java.util.*;
class Main{
    void lucky(int n){
        int sum=0;
         if(n==7){
            System.out.println("Lucky");
            return;
         }
         while(n!=0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
            if(sum==7){
                System.out.println("LUCKY");
                return;
            }
         }
         System.out.println("Not lucky");
         

    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Main obj=new Main();
        obj.lucky(n);


    }
}
