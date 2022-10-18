package PROJECT221012;

import java.util.*;

public class HashMapScoreEx {
    public static void main(String args[]) {
        HashMap<String, Integer> score = new HashMap<String, Integer>();
        score.put("김성동", 97);
        score.put("황기태", 88);
        score.put("김남윤", 98);
        score.put("이재문", 70);
        score.put("한원선", 99);
        System.out.println("HashMap의 요소 개수: " + score.size());

        Set<String> keys = score.keySet();

        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int result = score.get(name);
            System.out.println(name + " : " + result);
        }
    }
}
