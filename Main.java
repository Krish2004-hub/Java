import java.util.*;
import java.math.*;
class Main{
    void Array(int n,Scanner s,int[]arr,int E,int K){
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            if (Math.abs(arr[i]-E)==K){
                System.out.println(arr[i]);
                found= true;
            }}
            if(!found){
                System.out.println("Enter valid values");
            } }
    
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter absolute value:");
        int K=s.nextInt();
        System.out.println("Enter the E value:");
        int E=s.nextInt();
        int n=s.nextInt();
        int[]arr=new int[n];
        Main obj=new Main();
        obj.Array(n, s, arr,E,K);
    }

}