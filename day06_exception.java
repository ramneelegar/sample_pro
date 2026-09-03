import java.util.*;
class day06_exception{
    public static void main(String[] args) {

        System.out.println("Connection is est");
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a /b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception occured: ");
        }
        finally{
            System.out.println("connection is terminated");
        }

        try{
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("ele of array");
            int ele = sc.nextInt();
            System.out.println("enter index");
            int index =sc.nextInt();
            arr[index] = ele;   
            System.out.println(Arrays.toString(arr));
        }

        catch(ArithmeticException ae ){
            System.out.println("provide non-zero");
        }
    }
}
