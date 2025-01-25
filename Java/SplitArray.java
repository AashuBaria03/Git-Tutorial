import java.util.HashMap;

public class SplitArray{
      public static boolean isPossibleToSplit(int[] nums){
            HashMap<Integer,Integer> frequencyMap=new HashMap<>();
            for(int num:nums){
                  frequencyMap.put(num,frequencyMap.getOrDefault(num,0 )+1);

            }
            for(int freq:frequencyMap.values()){
                  if(freq>2){
                        return false;
                  }
            }
            int distictElement=frequencyMap.size();
            return distictElement>=nums.length/2;
      }
      public static void main(String[] args) {
        int[] num1={1,1,2,2,3,3};
        System.out.println("Test 1: "+isPossibleToSplit(num1));
        
      //   isPossibleToSplit(num1);
      }
}