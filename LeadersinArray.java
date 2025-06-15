import java.util.*;
class Main{
    void array(Scanner s,int n,int[]arr){
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();}
    }
    void arraycomparison(int[]arr,int n){
        int max=0;
        StringBuilder result=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
               result.insert(0,max+" ");
            }
        }
        System.out.println("The leaders obtained: "+result);
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=s.nextInt();
        s.nextLine();
        int arr[]=new int[n];
        Main obj=new Main();
        obj.array(s, n, arr);
        obj.arraycomparison(arr,n);
        
    }}
