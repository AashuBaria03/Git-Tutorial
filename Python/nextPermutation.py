def nextPermutation(nums):
    n = len(nums)
    
    # Step 1: Find the first decreasing element from the end
    i = n - 2
    while i >= 0 and nums[i] >= nums[i + 1]:
        i -= 1
    
    # Step 2: If the entire array is not in descending order
    if i >= 0:
        # Find the element just larger than nums[i] and swap
        j = n - 1
        while nums[j] <= nums[i]:
            j -= 1
        nums[i], nums[j] = nums[j], nums[i]  # Swap
    
    # Step 3: Reverse the elements after index 'i'
    nums[i + 1:] = reversed(nums[i + 1:])
    
# Example usage
nums = [1, 2, 3]
nextPermutation(nums)
print("Next permutation:", nums)
