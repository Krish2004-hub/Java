import java.util.*;
class Main{
    void array(Scanner s,int n,int[]arr){
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();}
    }
    void sum(int[]arr,int n){
        int totalsum=0;                      //=============================>      Firstly we need to find the total sum of an array Eg:[4,4,2,9,10] */
        int leftsum=0;                      //==============================>      Then fix left side sum as left sum as "0"
        for(int i=0;i<n;i++){
            totalsum+=arr[i];}             //===============================>      SUM OF ARRAY  ....  Eg:29 (from above array)
            for(int i=0;i<n;i++){
                totalsum-=arr[i];         //================================>      TOTAL SUM =TOTALSUM - CURRENT ELEMENT (arr[i])
        if(totalsum==leftsum){
            System.out.print("equilibrium val is: "+i);// COMPARISON TRUE MEANS PRINT THE CURRENT POSITION
            return;
        }
        leftsum+=arr[i];                        //Update leftsum value to the current element..
    }
    System.out.println("No equilibrium found..");
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=s.nextInt();
        s.nextLine();
        int arr[]=new int[n];
        Main obj=new Main();
        obj.array(s, n, arr);
        obj.sum(arr, n);
    }}
