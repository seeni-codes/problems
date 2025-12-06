public class Miss_order {

    public static void main(String [] args){

        int []arr={3,5,6,7,9,13};

        for(int i=0;i< arr.length-1;i++){
           int j=arr[i]+1;
            if (arr[i+1]!=j){
                System.out.println("missing number are  printed "+j);
            }
        }
    }

}
