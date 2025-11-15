

public class Linear {

    public static void main(String []args){
        int [] arr={2,35,3,2,234,4};

        int tar=9;
        boolean is=false;

        for (int i=0;i<arr.length;i++){
            if(tar==arr[i]){
                System.out.println(tar+" target found "+arr[i]);
                is=true;
                break;
            }
        }

        if(!is){
            System.out.println("element not found");
        }
    }

}
