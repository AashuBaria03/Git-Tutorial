public class sqertx{
    public static int mySqert(int x){
        if(x<2) return x;

        int left=1,right=x/2, ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            long square=(long)mid*mid;
            if(square==x){
                return mid;
            }else if(square<x){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
       public static void main(String[] args) {
        int x=8;
        System.out.println(mySqert(x));
       }
}