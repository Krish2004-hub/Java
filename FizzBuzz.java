import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the list of numbers to be displayed ?:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.println("Fizz");
            }
            if(i%5==0){
                System.out.println("Buzz");
            }
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }}}}
