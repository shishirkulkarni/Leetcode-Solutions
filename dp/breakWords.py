class Solution:
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        mem = [False] * (len(s) + 1)
        wordDict = set(wordDict)
        for i in range(len(s) + 1):
        	if s[0:i] in wordDict:
        		mem[i] = True
        		continue
        	j = 0
        	while j <= i:
        		mem[i] = mem[i] or mem[j] and s[j:i] in wordDict
        		j += 1
        return mem[-1]

s = Solution();
print(s.wordBreak("leetcode", ["leet","code"]))

