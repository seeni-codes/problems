import java.util.*;

public class user extends library{

    public void user_method(){
        Scanner sc=new Scanner(System.in);

        library li=new library();

        li.view_book(true);
////        System.out.println("Enter you name:");
////        String i=sc.nextLine();
//////        lis.add(i);
//
//        System.out.print("\nsearch books 1\nview books 2\nexit 0\n ");
//        int j=1;
//        System.out.print(" enter you choice:");
//        j=sc.nextInt();
//
//
//            switch (j) {
//                case 1:
//                    System.out.println("Enter the title of book:");
//                    String k= "zero to one";
//                    li.search(k);
//                    break;
//                case 2:
//                    li.view_book();
//                    break;
//
//            }

        }



    public static void main(String []args){
       user iu=new user();
       iu.user_method();

    }
}