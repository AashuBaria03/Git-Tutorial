def max_subarray(nums):
    max_sum=cur_sum=nums[0]

    for num in nums[1:]:
        cur_sum=max(num,cur_sum+num)
        max_sum=max(max_sum,cur_sum)
    return max_sum

arr=[-2,1,-3,4,-1,2,1,-5,4]
print("Maximum Subarray Sum",max_subarray(arr))    