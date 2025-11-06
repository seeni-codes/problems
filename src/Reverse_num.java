public class Reverse_num {

    public static void main(String [] args){
        int num=23345;
        int rev=0;

        //mad10 algorithm
        while(num!=0){
            rev=rev*10 +num%10;
           num/= 10;
            }
        System.out.println("reversed number "+rev);
        if(rev==num){

        }
        }
    }


