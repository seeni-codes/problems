import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting {

    public static void main(String []args){
        Sorting sr=new Sorting();
        Integer [] arr={1,45,32,64,322};
        sr.build_in(arr);
    }

    //using building methods
    public void build_in(Integer[] arr){
        //parallel sort
        Arrays.parallelSort(arr);
        System.out.println("parellelsort :"+ Arrays.toString(arr));

        //sort
        Arrays.sort(arr);

        //sort in reverse order on primtive datatype
        Arrays.sort(arr, Collections.reverseOrder());
    }

}
