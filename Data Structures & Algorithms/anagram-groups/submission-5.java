class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res =new HashMap<>();
        for(String c: strs){
            char[] charra=c.toCharArray();
            Arrays.sort(charra);
            String sorted=new String(charra);
            res.putIfAbsent(sorted,new ArrayList<>());
            res.get(sorted).add(c);
        }
        return new ArrayList<>(res.values());
    }
}
