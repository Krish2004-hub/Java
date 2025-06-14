//Ratan chooses the stock by selecting the day on which stock price is less and sell it in the day where stock price is high....
import java.util.*;
class Main{
    void array(int n,Scanner s,int arr[]){
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        //Array sorting manual logic...............>>
        /* int temp=0;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            temp=arr[j];
          arr[j]=arr[j+1];
           arr[j+1]=temp;
        }
    }
}
 for(int i=0;i<n;i++){
     System.out.println(arr[i]+" ");
 }    */
    }
    void minmax(int[]arr,Scanner s,int n){
        int profit=0;
        for(int i=0;i<n;i++){
        int t1=arr[0];
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
