class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer=new ArrayList<>();
        HashMap<HashMap<Character,Integer>,Integer> hashes=new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            HashMap<Character,Integer> hm=findHashMap(strs[i]);
            if(hashes.containsKey(hm))
            {
                outer.get(hashes.get(hm)).add(strs[i]);
            }
            else
            {
                hashes.put(hm,outer.size());
                List<String> newInner=new ArrayList<>();
                newInner.add(strs[i]);
                outer.add(newInner);
            }
        }

        return outer;
    }

    public HashMap<Character,Integer> findHashMap(String str)
    {
        HashMap<Character,Integer> countStr=new HashMap<>();
        for(char c:str.toCharArray())
        {
            countStr.put(c,countStr.getOrDefault(c,0)+1);
        }
        return countStr;
    }
}
