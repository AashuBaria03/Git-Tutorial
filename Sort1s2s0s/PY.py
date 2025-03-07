
def sortColors(nums):
    low, mid, high = 0, 0, len(nums) - 1

    while mid <= high:
        if nums[mid] == 0:
            nums[low], nums[mid] = nums[mid], nums[low]  # Swap 0 to the front
            low += 1
            mid += 1
        elif nums[mid] == 1:
            mid += 1  # Keep 1s in the middle
        else:  # nums[mid] == 2
            nums[mid], nums[high] = nums[high], nums[mid]  # Swap 2 to the end
            high -= 1

# Example Usage:
nums = [2, 0, 2, 1, 1, 0]
sortColors(nums)
print(nums)  # Output: [0, 0, 1, 1, 2, 2]
