class Solution(object):
    def singleNumber(self,nums):

        # return reduce(lambda x,y:x^y,nums)
        result=0
        for i in nums:
            result^=i
        return result
solution=Solution()

print(solution.singleNumber([1,2,3,4,5,1,2,3,4]))

    