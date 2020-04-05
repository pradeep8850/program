package Assignment;

import java.util.HashMap;
import java.util.Set;

public class Prgm7_CountRepetedWords {

	public static void main(String[] args) {
		
		String s1 = "hi hello hi gm good bad hi gm bye bye";

        String s2[] = s1.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : s2) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" = "+map.get(key));
            
        }
	}

}
