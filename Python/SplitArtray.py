from collections import Counter
def canSplit(nums):
    count=Counter(nums)

    for freq in count.values():
        if freq>2:
            return False

    distinct_elements=len(count)
    return distinct_elements>=len(nums)//2

print(canSplit([1,1,2,2,3,4]))    