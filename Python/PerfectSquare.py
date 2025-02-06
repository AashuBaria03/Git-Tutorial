class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num < 2:
            return True  # 0 and 1 are perfect squares
        
        left, right = 2, num // 2  # Start binary search

        while left <= right:
            mid = left + (right - left) // 2
            square = mid * mid

            if square == num:
                return True  # Found a perfect square
            elif square < num:
                left = mid + 1  # Search in the right half
            else:
                right = mid - 1  # Search in the left half
        
        return False  # Not a perfect square

# Example usage:
sol = Solution()
print(sol.isPerfectSquare(16))  # Output: True
print(sol.isPerfectSquare(14))  # Output: False
