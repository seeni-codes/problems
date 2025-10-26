public class test {

    public static void main(String []args){
        int n=9;
       int i= fact(n);
       System.out.println(i);
    }
    public static int fact(int n){
        int i=n;
        if(i<=0 ){
          return   0;
        }

        return fact(n-1)*fact(n-2);
    }


}
