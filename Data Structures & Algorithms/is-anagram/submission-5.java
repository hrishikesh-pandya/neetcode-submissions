class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(char i:s.toCharArray())
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(char i:t.toCharArray())
        {
            if(!hm.containsKey(i)) return false;
            hm.put(i,hm.get(i)-1);
        }

        for(char ch:hm.keySet())
        {
            if(hm.get(ch)!=0) return false;
        }

        return true;


    }
}
