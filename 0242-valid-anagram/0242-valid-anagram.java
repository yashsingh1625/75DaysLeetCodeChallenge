class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
         HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

         for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    map.remove(c); // remove if count becomes 0
                } else {
                    map.put(c, map.get(c) - 1); // decrement count
                }
            } else {
                return false; // extra char in t
            }
        }


        return map.isEmpty();
    }
}