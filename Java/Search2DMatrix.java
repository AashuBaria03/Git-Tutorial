public class Search2DMatrix{

    public static boolean solution(int[][] matrix,int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
           int m=matrix.length;
           int n=matrix[0].length;
           int left=0;
           int right=(m * n)-1;

           while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/n;
            int col=mid%n;
            int midvalue=matrix[row][col];

            if(midvalue==target){
                return true;
            }
            else if(midvalue<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
           }
           return false;


    }

    public static void main(String[] args) {
          int[][] matrix={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
          };
          int target=3;
          System.out.println(solution(matrix, target));
    }
}