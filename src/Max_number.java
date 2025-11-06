public class Max_number {

    public static void main(String [] args){

        Max_number mx=new Max_number();
        int []arr={5,6,3,7,3,8,2};
        int len=arr.length;

        //br
        mx.brute_force(arr,len);

    }
    //using brute
    public void brute_force(int []arr,int len){

        int max=  arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>max){
                max=arr[i];
                System.out.print("@");
            }
            System.out.print("#");

        }
        System.out.println("\nthe max number in the array is : "+max);
    }




}
