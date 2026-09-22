import java.util.Scanner;

public class day11_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println( "Bubble sort ");
        bubblesort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println( "Insertion sort ");
        insertionsort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
        
        System.out.println();
        System.out.println( "Selection sort ");
        selectionsort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubblesort(int []arr){        
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    public static void insertionsort(int [] arr){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]> key){     // checking all left side ele still greater then 0 
                arr[j+1] = arr[j];            
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void selectionsort(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
