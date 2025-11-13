public class Sumoftwo_array {

    public int i=90;

//    public Sumoftwo_array(int i){
//        this.i=i;
//    }


    public static void main(String []args){

        Sumoftwo_array sota=new Sumoftwo_array();
        int [] arr={2,33,43,65,65,87};

        sota.two_array(arr);

    }



    //brute force
    public void two_array(int []arr) {

        int sum = 89;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " is add of " + sum);
                    break;
                }
            }
        }
    }
}

