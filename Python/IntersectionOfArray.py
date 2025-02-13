class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        return list(set(nums1) & set(nums2))  # Using set intersection

# Example usage:
sol = Solution()
print(sol.intersection([1,2,2,1], [2,2]))  # Output: [2]
print(sol.intersection([4,9,5], [9,4,9,8,4]))  # Output: [9,4] (order may vary)
