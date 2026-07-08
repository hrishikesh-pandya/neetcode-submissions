class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();

        for(char c:s.toCharArray())
        {
            int value=0;
            if(hm.containsKey(c))
            {
                value=hm.get(c);
                hm.replace(c,value+1);  
            } 
            else hm.put(c,1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(!hm.containsKey(t.charAt(i)))
            {
                return false;
            }
            hm.replace(t.charAt(i),hm.get(t.charAt(i))-1);
        }
    
        for(char c:hm.keySet())
        {
            if(hm.get(c)!=0) return false;
        }
        return true;
    }

}
