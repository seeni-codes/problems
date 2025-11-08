import java.util.HashSet;

public class Duplicate {

    public static void main(String [] args){
        Duplicate dup=new Duplicate();
        int []arr={34,53,22,6,7,4};
        String []str={"one","make","rescip","one","how"};
        HashSet <String> set=new HashSet<>();
        dup.dublicate(arr);
        dup.dublicate(str);
        dup.dublicate(set,str);

    }

    public void dublicate(int []arr){
        int len=arr.length;

        for(int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" have a duplicate of  "+arr[j]);
                }
        }


        }
    }
    public void dublicate(String []arr){
        int len=arr.length;

        for(int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]+" have a duplicate of  "+arr[j]);
                }
            }


        }
    }

    //using hashset set is not allow dublicate
    public void dublicate(HashSet <String >set,String []arr){


            for (String i:arr){
                set.add(i);
                System.out.println("before "+i);
                }
            for(String j:set){
                System.out.println(j);
            }


        }
    }
