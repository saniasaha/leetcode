class Solution(object):
    def sortedSquares(self, nums):
        ans = []
        for x in nums:
            ans.append(x*x)

        ans.sort()
        return ans
            
        