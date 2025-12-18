public class Bubble {


    public static void main(String []args)  {

        int []arr={43,0,7,32,53,93,456};
        int o=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {


                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int h:arr){
            System.out.println(h);
        }
    }

}
