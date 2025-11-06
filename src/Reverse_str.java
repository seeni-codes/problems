public class Reverse_str {

    public static void main(String []args){
        //string
        String str="madam";
        String rev="";
        int j=str.length();
        for(int i=j-1;i>=0;i--){
            rev += str.charAt(i);

        }
        System.out.println("before "+str+" after "+rev);
        if(str.equals(rev)){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("given string is not a palindrome");
        }
    }

    //char
    public void rev_met(String str){
        char []arr=str.toCharArray();
        String rev= "";
        int len=str.length();
         for(int i=len-1;i>=0;i--){
             rev=rev+str.charAt(i);
         }
    }

}
