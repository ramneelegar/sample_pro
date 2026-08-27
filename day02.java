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
        System.out.println("second largest : "+seclargest(arr));

        // 2nd smallest
        secsmallest(arr);

        // pair with each ele
        pair(arr);

        // product even arr ele contain negative num
        System.out.println("nefative produvt ");
        productnegative(arr);

        // max product of array of 2 ele
        maxproduct(arr);
        
        sumpair(arr,k);

        removeduplicate(arr);

        System.out.println("unique ele: ");
        unique(arr);

        System.out.println("occurance");
        occurance(arr);

        System.out.println("prime num of n: ");
        prime(n);

        // largest repeating ele i array
        System.out.println("largest repeating ele: ");
        System.out.println(largestrepeating(arr));

    }



    // sum of 2 ele is = k
    public static void sumpair(int arr[],int k) {
        for(int i =0; i <arr.length ; i++){
            for(int j = i+1; j <arr.length; j++){
                if(arr[i]+arr[j] == k){
                System.out.println("sum of 2 ele =k : "+arr[i] + " " + arr[j]);
                }
            }
        }
    }

    // diff of 2 ele is = k



    // // prime 
    public static void prime(int n) {
        // int count = 0; 
        for (int i = 2; i*i <=n; i++) {  // or use i*i <= n
            if (n % i == 0) {
                System.out.println("prime num");
                System.out.println(i + " factors");
                System.out.println(" not prime");
            }
        }
        System.out.println(n + " is prime");
    }




    // occurance
    public static void occurance(int []arr) {
        int count = 1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i] + " " + count);
                count =1;
            }
        } System.out.println(arr[arr.length-1]);
    }



    // dont print duplicate
    public static void removeduplicate(int []arr) {
        System.out.println("remove duplicate : ");
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                System.out.println(arr[i]+" ");
                
            }
        }System.out.println(arr[arr.length-1] ); 
    }



    // print only unique ele 
    // print num of unique ele
    public static void unique(int []arr) {
        int count = 1;
        int sum = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    sum +=1;
                   // System.out.println(sum );
                    // System.out.println(count + "count");
                }    
                count =1;
            }
        }// this if is for last ele
        if(count ==1){
            sum++;
        }System.out.println(sum);
    }



    // largest repeating num
    public static int largestrepeating(int []arr) {
        
        for(int i = arr.length-1 ; i>=1 ; i--){  // starting from last becauese we need largest num and its a sorted array
            if(arr[i] == arr[i-1]){
                return (arr[i]);
            }
        }
        return -1;
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
    public static int seclargest(int arr[]) {
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
        }return secondlargest;
        // System.out.println("Second largest: " + secondlargest);
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
    public static void maxproduct(int [] arr) {
        int l =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> l){
                l = arr[i];
            }
        }
        int e = seclargest(arr);
        System.out.println("max product : " +e*l);    
    }
    

    // min product
    // combination of positie and negative and there product
    public static void productnegative(int arr[]) {
        int productarr =1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i]=-arr[i];
            }
            productarr *= arr[i];

        }System.out.println(productarr);        
    }



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
