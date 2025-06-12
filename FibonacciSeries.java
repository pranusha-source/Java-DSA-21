class FibonacciSeries{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int n=7;
        //int result=fibonacci(n);
        System.out.println("fibonacci series up to 7");
        for(int i=0;i<n;i++){
        //System.out.println("7th number is" +result);
            System.out.println(fibonacci(i));
        }
    }

}