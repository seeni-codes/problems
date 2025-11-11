import java.util.Arrays;

public class Equal_array {

    public static void main(String []args){
        Equal_array eq=new Equal_array();

        int []arr={3,4,32,5,45,43};
        int []ar={3,4,32,5,45,4 };

//        eq.in_bult(arr,ar);
        eq.logical(arr,ar);



    }

    //in build method
    public void in_bult(int []arr,int []ar){
        boolean is=Arrays.equals(arr,ar);

        if(is ==true){
            System.out.println("array are  equal");
        }else {
            System.out.println("array are not equal");
        }
    }

    //logical method
    public void logical(int []arr,int []ar){
        int len=arr.length,lent=ar.length;
        int num=arr[0];
        boolean is =true;
        if(len==lent) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=ar[i]){
                    is=false;
            }
        }
        }
        if(true){
            System.out.println("array are  equal");
        }
        else {
            System.out.println("array are not equal");
        }
    }


}
