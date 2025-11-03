public class Digit {

    public static void main(String []args){
        int num=3345;
        int count =0;
       while(num!=0){
           num=num/10;
           count +=1;
//           num *=10;
       }
       System.out.println("digit   of the "+count);
    }


}
