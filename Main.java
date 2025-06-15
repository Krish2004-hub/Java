import java.util.*;
class Main{
    void array(int n,Scanner s,int arr[]){        // RATAN PROFIT
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
    }
    void minmax(int[]arr,Scanner s,int n){
        int profit=0;
        for(int i=0;i<n;i++){
        int t1=arr[0];                            // BEST WAY TO COMPARE MINIMUM STOCK PRICE AND MAXIMUM STOCK PRICE
        int t2=arr[n-1];
        if(t1>t2){
            profit=t1-t2;
        }
        else{
            profit=t2-t1;
        }     
    }
    System.out.println("The Ratan's stock profit :"+" "+profit);
}
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of days required for the stock?:");
        int n=s.nextInt();
        int arr[]=new int[n];
        Main obj=new Main();
        obj.array(n, s, arr);
        obj.minmax(arr, s, n);

    }
}