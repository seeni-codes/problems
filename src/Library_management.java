import java.util.*;


  public class Library_mangement {




    public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println("choose the input \nuser 1\nLibrarian 2\n");
            int in=input.nextInt();


      switch (in){
        case 1:
            user.user_details();
            break;
        case 2:
//            librarian.
        case 3:


        default:
            System.out.println("invaild input ");
      }

    }

class  book {

    public static List<String >list;
    public static Scanner out;
    private static int id;

        public int getid(){return id;}
        public static int setid(){
            id =0174;
            return id;}

         //view books
        public static   void view_books(){
            List<String > list=new LinkedList<>();
            list.add("limitless");
            list.add("zero to one");
            list .add("think stright");
            list.add("48 laws");

            for(String i:list){
                System.out.println(i);
            }
        }

        //add book
        public static void add_books(){
            System.out.print("\nenter Librarian id:");
            int l_id=out.nextInt();

            if(l_id==id) {
                System.out.print("\nenter name of the book to add:");
                String i = out.nextLine();
                list.add(i);
                view_books();
            }
            else{
                System.out.print("\nyour Librarian id is incorrect:");

            }

        }


    }


// user class
class user extends book{
    public static Scanner sc =new Scanner(System.in);

      public static void b_books() {
          

          System.out.println("enter the name of book");
          String j = sc.nextLine();
          boolean is = true;
          for (String i : list) {
              is = true;
              if (i.equals(j)) {
                  System.out.println(j + " it's available");
                  is = false;
              }
          }
          if (!is) {
              System.out.println(j + " it's not available sorry");
          }
      }

          public static void  user_details(){

          System.out.println("you are welcome \n could you Enter you name:");
          String name =sc.nextLine();
          ArrayList<String> us=new ArrayList<>();
          us.add(name);
          b_books();

          }


      }

   }
   class librarian {

    }





