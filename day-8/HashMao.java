import java.util.*;

public class HashMao{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1 , "Durai");
        map.put(2 , "Alice");
        map.put(3 , "Bob");

        for(int k : map.keySet()){
            System.out.println(k +" "+ map.get(k));
        }
    }
}