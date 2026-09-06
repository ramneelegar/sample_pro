import java.util.*;

public class day09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<String, Integer>(); // for sorted order ascending

        // LinkedHashMap<String,Integer> map2 = new  LinkedHashMap<String,Integer>(); // for printing in insertion order
        
        // TreeMap<String,Integer> map3 = new  TreeMap<String,Integer>(); // for printing in sorted orde0r   a--z
       
        map.put("India", 300);
        map.put("India", 500);
        map.put("china", 500);
        map.put("uae", 500);
        // map.put(500,"uaje");

        System.out.println(map);
        Set<String> keys = map.keySet();
        // System.out.println(keys);
        for (String key : keys) {
            Integer v = map.get(key);
            System.out.println(key + " " + v);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());
        }


        String s = sc.nextLine();
        System.out.println(countOcurance(s));
        
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(pairinArray(arr));

        String s2 = sc.nextLine();
        // wordsmorethn3(s2);

        sc.close();
    }
}


