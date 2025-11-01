import java.util.*;

class booksr{
    private int id ;
    private String title;

    public booksr(int id, String title){
        this.id=id;
        this.title=title;
    }

    public int  getId(){return id;}
    public String gettitle(){return title;}

}
class library6{
    public List<books>list=new LinkedList<>();

//    public library(int id, String title) {
//        super(id, title);
//    }

    public void add_books(){
        list.add(new books(1,"limitless"));
        list.add(new books(2,"zero to one"));
        list .add(new books(3,"think stright"));
        list.add(new books(4,"48 laws"));


        }


    }

    public class Library_management{
        public static void main(String []args){
            library li=new library();

        }
    }





