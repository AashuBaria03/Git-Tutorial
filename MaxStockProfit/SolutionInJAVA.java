class SolutionInJAVA {

    public int maxProfit(int[] prices){
        if(prices.length == 0||prices==null) return 0;
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
       SolutionInJAVA s=new SolutionInJAVA();
       int[] prices1={7,1,5,3,6,4};
       
       System.out.println((s.maxProfit(prices1)));
    }
}
