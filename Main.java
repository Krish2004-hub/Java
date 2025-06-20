import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String binary=Integer.toBinaryString(n);
        int count=0;
        for(char ch:binary.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        if(count%2==0){
            System.out.println("Evil number");
        }
        else{
            System.out.println("Not an evil number");
        }
    }
}