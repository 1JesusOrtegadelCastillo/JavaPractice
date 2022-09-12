package other;

import java.util.*;

public class AnagramTest {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> mapOfStrings = new HashMap<>();
        for (String s : strs){
            char[] ch = s.toCharArray();
            System.out.println(ch);
            Arrays.sort(ch);
            System.out.println("---------");
            System.out.println(ch);
            String key = String.valueOf(ch);
            if(!mapOfStrings.containsKey(key)){
                mapOfStrings.put(key, new ArrayList<>());
            }
            mapOfStrings.get(key).add(s);
            System.out.println(mapOfStrings);
        }
        return new ArrayList<>(mapOfStrings.values());
    }
}
