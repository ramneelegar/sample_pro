import java.util.*;


public class day07 {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        System.out.println(lst.size());  // initial size is 0
        
        // demo d = new demo(); // here passing a referance of class demo

        lst.add(1);
        lst.add(12.34f);
        lst.add(12.365);
        lst.add('a');
        lst.add("string");
        lst.add(lst);
        // lst.add(d);// obj we can store in it only after creating its reeferance

        System.out.println(lst);
        // here it will only store the integaer values
        ArrayList<Integer>  a= new ArrayList<Integer>();

        HashSet set = new HashSet();

        // LinkedHashset set = new LinkedHashSet<>();
        // TreeSet set = new TreeSet();

        set.add(1);
        set.add(1.00f);
        set.add('c');
        set.add("string");
        set.add("string"); // we can add but it will nor=t store itt
        //set.add(d2)// obj we can store in it only after creating its reeferance

        System.out.println(set);
        // here it will only store the char values
        HashSet<Character>  aa= new HashSet<Character>();
        aa.add('a');
        aa.add(null);


        // removing duplicate
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();

        String result = removeDuplicate(s);
        System.out.println(result);


        // sorting arrayy
        int n = sc.nextInt();

        System.out.println("enter array");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        TreeSet<Integer> r = removeDuplicatearr(arr);
        for(int x: r){
            System.out.println(x+" ");
        }

        // LinkedHashSet<String> l = removedulpwords(s);

        for(String x: aa){
            System.out.println(x+" ");
        }

        // System.out.println(alphorder(s));
    }

    public static TreeSet<String> alphorder(String s) {
        TreeSet<Character> alph = new TreeSet<Character>();
        String[] arr = s.split(",");
        for(int i=0; i<arr.length; i++){
            alph.add(arr[i]);
        }   
        
        return alph;
    }


    public static TreeSet<Integer> removeDuplicatearr(int [] arr) {
        TreeSet<Integer> setarr = new TreeSet<Integer>();
        for(int i=0; i<arr.length; i++){
            setarr.add(arr[i]);
        }   
        
        return setarr;
    }
}
