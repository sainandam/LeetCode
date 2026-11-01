class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

      boolean sign=(dividend<0)^(divisor<0);

        long a=Math.abs((long)dividend);
        long b=Math.abs((long) divisor);
        long res=0;
        while(a>=b){
            long multiple=1;
            long temp=b;
            while(a>=(temp<<1)){
                temp<<=1;
                multiple<<=1;
            }
            a-=temp;
            res+=multiple;
        }
        return (int) (sign? -res:res);
    }
}