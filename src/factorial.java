public class factorial {


    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i < n; i++) {
            System.out.println(fact(i)+" factorial");
        }

        //fibo
        int j=fibon(n);
        System.out.println("fiboncci "+j);

    }
    //fibonacci
    public static void fibon() {
        int n = 8;
        int f = 0, s = 1;
        for (int i = 0; i <= n; i++) {
            int next = f + s;
            System.out.println(next);
            f = s;
            s = next;
        }
        System.out.println(s);
    }

    //recursion Fibonacci
    public static int fibon(int n){
        if (n<=0) {
            return 0;
        }
        else{
            return n+fibon(n-1);
        }

    }


    //factorial
    public static void fact (){
        int n=4;
        int fact=0;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }


    // recursion factorial
    public static  int fact(int n){
    if(n==0) return 0;
    if (n==1) return 1;
    return n* fact(n-1);
    }
}






