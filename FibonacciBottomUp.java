class FibonacciBottomUp{
    public static void main(String[] args){
        int n=7;
        fibonaccibottom(n);
    }
    public static void fibonaccibottom(int n){
        if(n<=0){
            return;
        }
        int prev1=0,prev2=1;
        System.out.print(prev1 +" ");
        if(n==1){
            return ;
        }
        System.out.print(prev2 +" ");
        for(int i=2;i<=n;i++){
            int current=prev1+prev2;
            prev1=prev2;
            prev2=current;
            System.out.println(current);
        }
    }
}