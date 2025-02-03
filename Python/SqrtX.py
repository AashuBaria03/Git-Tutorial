class Solution(object):
    def mySqrt(self,x):
        if x<2:
            return x
        left,right=1,x//2

        while left<=right:
            mid=(left+right)//2
            squar=mid*mid

            if squar==x:
                return mid
            elif squar<x:
                ans=mid
                left=mid+1
            else:
                right=mid-1
        return ans
if __name__ == "__main__":
    x = int(input("Enter a non-negative integer: "))
    solution = Solution()
    print("Square root (rounded down):", solution.mySqrt(x))
