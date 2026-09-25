import java.util.Scanner;

public class day11_recursion{
    
    public static void main(String[] args) {

        
        System.out.println("THis is decima num :"+12345);
        System.out.println("This is octal : "+045);
        System.out.println("this is Hexadecimal : "+0x45);
        System.out.println("This is binary : "+0b0101);

        System.out.println("printing num from n --> 1");
        fun(5);

        System.out.print("fac to n : ");
        System.out.println(fac(5));

        System.out.print("n natural num : ");
        System.out.println(fibo(8));

        System.out.print("Natural numbers are : ");
        natural(5); 

        System.out.print("count of digits : ");
        System.out.println(countdigit(123456));

        System.out.print("sum of digits : ");
        System.out.println(sumofdigit(1234));

        int arr[] ={1,2,3,4,5};
        System.out.print("sum of array : ");
        System.out.println(sumofarray(arr, 0));
    }
    


    public static void fun(int n ){
        if(n<1){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

     public static int fac(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        return n*fac(n-1);
    }

    public static int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void natural(int n){
        if(n==0){
            return;
        }
        natural(n-1);  // if u called natural(n-1) after the print statement then it will print in reverse order
        System.out.println(n);
    }

    public static int countdigit(int n){
        if(n==0){
            return 0;
        }
        return countdigit(n/10)+1;
    }

    public static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return n%10 +sumofdigit(n/10) ;
    }

    public static int sumofarray(int[] arr, int i){
        if(i == arr.length){  
            return 0;
        }
        return sumofarray(arr, i+1) + arr[i];
    }
    

}
