def findMissingAndRepeatedValue(grid):
    n=len(grid)
    N=n*n
    count=[0]*(N+1)

    for row in grid:
        for num in row:
            count[num]+=1

    repeated,missing=-1,-1
    for num in range(1,N+1):
        if count[num]==2:
            repeated=num
        elif count[num]==0:
            missing=num

    return [repeated,missing]   
         
grid1=[[1,3],[2,2]]
print(findMissingAndRepeatedValue(grid1))         