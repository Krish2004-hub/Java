import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String size:?");
        int n=s.nextInt();
        s.nextLine();
     String lonodd="";
        for(int i=0;i<n;i++){
            String sentence=s.nextLine();
            String[]words=sentence.split(" ");
            for(String word:words){
                if(word.length()%2!=0&&word.length()>lonodd.length()){
                    lonodd=word;
                }
            }

        }
    if(!lonodd.isEmpty()){
        System.out.println(lonodd);
    }
    else{
        System.out.println("Better luck next Time....");
    }
}}
