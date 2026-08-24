import java.util.*;

public class day03 {
    public static void main(String[] args) {
        String s1 = "SACHIN";
        String s2 = "SAURAV";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s1));

        String s3 = "JAVA";
        String s4 = "JAVAC";
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));

        System.out.println(1 + 1 + 1);
        System.out.println(1 + 1 +"1");
        System.out.println(1 + "1" +1);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        // printing string
        for(int i = 0; i < s.length(); i++){
            t = t + s.charAt(i);
           
        }
        System.out.println(t);

        char k = sc.next().charAt(0);

        reverse(s);
        palindrome(s);

        space(s);
        letters(s);


        int a = word(s);
        System.out.println(a);

        int v = vowels(s);
        System.out.println(v);

        String r = removespecialchar(s);
        System.out.println(r);

        String f= tolower(s);
        System.out.println(f);

        findindex(s,k);
    }
    // take input from user and print the string in reverse order
    public static void reverse(String s) {
        String r = "";
        for(int i = s.length()-1; i>= 0; i--){
            r = r + s.charAt(i);

        }
        System.out.println(r);

        // diifferent method
        for(int i=0 ; i < s.length(); i++){
            r = s.charAt(i) + r;
        }System.out.println(r);
    }

    public static String palindrome(String s) {
        int i =0;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return "not palinderome";
            }
        }return "palindrome";
    }

    // count the number of space
    public static void space(String s){
        int count = 0;
        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count ++;
            }              
        }System.out.println(count);
    }

    // count number words
    public static int word(String s){
        int count = 0;
        for(int i=0 ; i < s.length()-1; i++){
            if(s.charAt(i) == ' ' &&  s.charAt(i++) != ' '){
                count ++;
            }              
        }return(s.charAt(0) == ' '? count : count++);
    }
    
    // count the number of letters in the string
    public static void letters(String s){
        int count = 0;
        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            } else{
                count ++;
            }             
        }System.out.println(count);
    }


    // return count of vowels
    public static int vowels(String s){
        int count = 0;
        String ch = "aeiou";
        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'||s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u' ){
                count ++;
            } 
            // if(ch.charAt(i) == s.charAt(i)){
            //     count ++;
            // }

        }return count;
    }

    // remove special char and print reming
    public static String removespecialchar(String s){
        String t = "";
        for(int i=0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >='A' && ch <='Z') || (ch >='a' && ch <='z') || (ch >='0' && ch <='9')){
                t = t+ ch;
            }              
        }return t;
    }

    public static String tolower(String s){
        String t ="";
        for(int i=0 ; i < s.length(); i++){
            char ch = s.charAt(i); 
            t = t +(char)(ch+32) ;            
        }return t;
    }

    public static void findindex(String s, char k){
        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == k){
                System.out.println(i);
            }              
        }
    }






    // public static void palindrome(String s){
    //     String r = "";
    //     for(int i = s.length()-1; i>= 0; i--){
    //         r = r + s.charAt(i);
    //     }
    //     if(s.equals(r)){
    //         System.out.println("palindrome");
    //     }else{
    //         System.out.println("not palindrome");
    //     }

    // } 
}
