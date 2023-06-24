class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer,List<String>> Map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) count[c - 'a']++;
            int hash = Arrays.hashCode(count);
            if (!Map.containsKey(hash)) Map.put(hash, new ArrayList<>());
            Map.get(hash).add(s);
        }
        for (List<String> l : Map.values()) res.add(l);
        return res;
    }
}