import java.util.*;
class Main{
    static int Reve(int n){
        int dig=0;
        int rev=0;
        for(int i=1;i<=n;i++){
            dig=n%10;
            rev=dig*10+n;
            n=n/10;
        }
        return rev;
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean twistedPrime(int n){
        int reversed=Reve(n);
        return prime(n)&&prime(reversed);
        }
    
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(twistedPrime(n)){
            System.out.println(n+"TWISTED PRIME");
        }
        else{
            System.out.println(n+ "NOT A TWISTED PRIME");
        }
    }
}