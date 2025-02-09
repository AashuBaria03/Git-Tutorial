import java.util.Arrays;
class SolutionJAVA{
    public int[] findMissingAndRepeatedValues(int[][] grid){
        int n=grid.length;
        int N=n*n;
        int[] count=new int[N+1];
        int a=-1,b=-1;

        for(int[] row:grid){
            for(int num:row){
                count[num]++;
            }
        }
        for(int num=1;num<=N;num++){
            if(count[num]==2){
                a=num;
            }
            if(count[num]==0){
                b=num;
            }
        }
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        SolutionJAVA s=new SolutionJAVA();
        int[][] grid = {{1, 3}, {2, 2}};
        System.out.println(Arrays.toString(s.findMissingAndRepeatedValues(grid))); // Output: [2, 4]
    }
}