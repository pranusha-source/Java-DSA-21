import java.util.HashMap;
import java.util.Map;
class FibonacciTopDown{
        private static Map <Integer,Integer> res=new HashMap<>();
        public static int fibonaccihash(int n){
            if(n<=1){
                return n;
            }
            if(res.containsKey(n)){
             return res.get(n);
        }
        int result=fibonaccihash(n-1)+fibonaccihash(n-2);
        res.put(n,result);
        return result;
    }
    public static void main(String[] args){
        int n=7;
        int result=fibonaccihash(n);
        System.out.println(result);
    }
}