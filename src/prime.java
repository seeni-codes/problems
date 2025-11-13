public class prime {

    public static void main(String [] args){

    int prime =11;

    boolean is =false;
    for(int i=2;i<prime;i++){
        if(prime%i==0){
            is=true;
            break;
        }
    }

    if(!is){
      System.out.println(prime +" is a prime number ");
    }
    else{
        System.out.println(prime +" is not a prime number ");
    }
    }


}