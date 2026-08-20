import java.util.*;
public class day01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length of array");
        int n = sc.nextInt();

        System.out.println("enter target");
        int k = sc.nextInt();

        System.out.println("enter array");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        
        // product of array
        int product = product(arr);
        System.out.println("product of array is " + product);

        // max index of arry
        int maximum = max(arr);
        System.out.println("Maximum: " + maximum);

        // min index
        int minimum = min(arr);
        System.out.println("Minimun: " + minimum);

        // min and max index
        // maxindex(arr);

        // occurance
        int a=occurance(arr,k);
        System.out.println(a);

        int ind = index1(arr, k);
        System.out.println("index value is "+ ind);

        
        sumofminmax(arr);
        
        sc.close();
    }
    
    // find max ele of array
    public static int max(int[] arr) { // wirte a datatype at the time of creation 
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // minimum of array
    public static int min(int[] arr) { // wirte a datatype at the time of creation 
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min; 
    }
    // // finding max ele of ele  compressed way
    // public static void maxminele(int [] arr) {
    //     int max = arr[0];
    //     int min = arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //         // finding min
    //         if(arr[i] < min){
    //             min = arr[i];
    //         }
    //     }System.out.println("max ele "+max);
    //     System.out.println("min ele " +min);
    // }

    // product of array
    private static int product(int[] arr) {
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        return product;
    }

    // finding max index
    public static void maxindex(int arr[]){
        int maxindex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> maxindex){
                maxindex = i;
            }
        }System.out.println(maxindex); 
    }

    // counting occurance
    public static int occurance(int[] arr, int k){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == k ){
                count ++;
            }
        }return count;
    }

    // return index of the ele
    public static int index1(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }return -1;   
    }

    // finding the minmum and the max sum of the array n-1
    public static void sumofminmax(int [] arr){
        int max = max(arr);
        int min = min(arr);
        int sum = 0;
        for(int i = 0 ; i <arr.length; i++){
            sum = sum+arr[i];

        }
        int largestsum = sum - min;
        int smallestsum = sum - max;
        System.out.println( "largest " +largestsum);
        System.out.println("smallest "+smallestsum);
    }
}
