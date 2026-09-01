class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        news=""

        for i in s:
            if(i.isalnum()):
                news=news+i
        
        l=0
        r=len(news)-1

        while l<r:
            if news[l]==news[r]:
                l=l+1
                r=r-1
                continue
            else:
                return False
            
            
        
        return True