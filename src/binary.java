public class binary {

    public static void main(String []args){

        int [] arr={24,25,33,66,74};

        int first=0;
        int last=arr.length-1;


        int target=66;
        for(int i=0;i<arr.length;i++){
            int mid =(first+last)/2;
            if(arr[mid]==target){
                System.out.println(target+" number found "+mid);
                break;
            } else if (arr[mid]<target) {
                first=mid+1;
//                System.out.println(target+" number found "+mid);
            }
            else if(arr[mid]>target){
                last=mid-1;
            }


        }
    }

}
