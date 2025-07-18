        import java.util.*;
        class Main{
        public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=a.toLowerCase();
        String vowel="";
        String consonant="";
        int vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<b.length();i++){
              char ch=b.charAt(i);
              if(Character.isLetter(ch)){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowel=vowel+ch;
            vowelcount++;
        } 
      else{
            consonant=consonant+ch;
            consonantcount++;
      }}}
        System.out.println(vowel+" "+vowelcount);
        System.out.println(consonant +" "+consonantcount);
      }}
        
    
