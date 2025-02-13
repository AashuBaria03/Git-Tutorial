class SolutionInJAVA{
    public double myPow(double x,int n){
        if(n==0) return 1.0;
        long exp=n;
        if(exp<0){
            x=1/x;
            exp=-exp;

        }
        double result=1.0;
        while(exp>0){
            if(exp%2==1){
                result*=x;
            }
            x*=x;
            exp/=2;
        }
        return result;
    }
    public static void main(String[] args) {
        SolutionInJAVA s=new SolutionInJAVA();
        System.out.println(s.myPow(2,10 ));
        System.out.println(s.myPow(2,3));
    }
}