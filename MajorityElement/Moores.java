import java.util.Scanner;
public class Moores {
    public static int Solution(int[] nums){
    int candidate=nums[0],count=0;

    for(int num:nums){
        if(count==0){
            candidate=num;
        }
        if(candidate==num){
            count++;
        }
        else{
            count--;
        }
    }
    return candidate;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(Solution(nums));

    }
    
}
