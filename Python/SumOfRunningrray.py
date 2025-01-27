def runningSum(nums):
    result=[]

    cumultive_sum=0

    for num in nums:
        cumultive_sum+=num
        result.append(cumultive_sum)
    return result

print(runningSum([1,2,3,4,5,6,7,8,9,10,11,12,13]))    