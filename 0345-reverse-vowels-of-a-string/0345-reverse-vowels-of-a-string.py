class Solution:
    def reverseVowels(self, s: str) -> str:
        li=[]
        vowels = "aeiouAEIOU"
        for i in s[::]:
            if i in vowels:
                li.append(i)
        n=len(li)-1
        li2=list(s)
        for i in range(0,len(li2)):
            if li2[i] in vowels:
                li2[i]=li[n]
                n-=1
        return "".join(li2)

        