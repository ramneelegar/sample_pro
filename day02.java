import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter size");
        int n= sc.nextInt();

        System.out.println("enter target");
        int k= sc.nextInt();

        int [] arr = new int[n];

        System.out.println("enter array ele");
        for(int i=0; i <arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // product of array
        product(arr);

        // 2nd largest
        seclargest(arr);

        // 2nd smallest
        secsmallest(arr);

        // pair(arr);
        

        // sumpair(arr,k);

    }

    // product of array
    public static void product(int arr[]) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        System.out.println(prod);

        for (int i = 0; i < arr.length; i++) {
            int result = prod / arr[i];
            System.out.print(result + " ");
        }

        System.out.println();
    }

    // 2nd largest ele in array
    public static void seclargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } 
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }System.out.println("Second largest: " + secondlargest);
    }

    // 2nd smallest ele in array
    public static void secsmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];

            } 
            else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }System.out.println("Second smallest: " + secondsmallest);
    }

    // max sum of 2 element of array
        // add largest and secound largest element of above code

    public static void maxSum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } 
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }System.out.println("Max sum of 2 elements: " + (largest + secondlargest));
    }

    // min sum of 2 element of array
    // add smallest and secound smallest element

    // max product
    // min product
    // combination of positie and negative and there product

    // return posiable all pair in an array
    public static void pair(int [] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    // sum of 2 ele is evqal to given target 
    
    // difference of 2 ele is evqal to given target
    // if(arr[i]-arr[j] == k || arr[j]-arr[i] == k)

    
 







    

}
