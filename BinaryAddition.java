import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
       String a=s.next();
       String b=s.next();
       int num1=Integer.parseInt(a,2);
       int num2=Integer.parseInt(b,2);
       int sum=num1+num2;
       String binary=Integer.toBinaryString(sum);
       System.out.println(binary);
    }
}
