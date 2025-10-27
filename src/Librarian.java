import java.util.*;



class books{
    private int id ;
    private String title;

    public books(int id,String title){
        this.id=id;
        this.title=title;
    }

    public int  getId(){return id;}
    public String gettitle(){return title;}

}


class library {
    public List<books> list = new LinkedList<>();

//    public library(int id, String title) {
//        super(id, title);
//    }

    public void add_books() {
        list.add(new books(1, "limitless"));
        list.add(new books(2, "zero to one"));
        list.add(new books(3, "think straight"));
        list.add(new books(4, "48 laws"));
        list.add(new books(5, "laws and guns"));



    }

    public void viwe_book() {
        for (books i : list) {
            System.out.println(i.getId() + "-" + i.gettitle());
        }

    }

    public void search (String booke){

        boolean is=false;
        for(books b:list){
            if (b.gettitle().equals(booke)) {
                is = true;
                break;
            }
        }
        if (is){
            System.out.println(booke+" is found ");
        }
        else {
            System.out.println(booke +" not found");
        }

    }

    public void remove_books(String book){
        boolean is=true;
        for(books one:list){
            if(one.gettitle().equals(book)){
                list.remove(one);

                is=false;
                break;
            }
        }
        if(is){
            System.out.println(book+" not found to remove \n");
            viwe_book();
        }
        else {
            System.out.println(book+" removed and updated \n");
            viwe_book();

        }

    }
}


    public class Librarian {
        public static void main(String[] args) {
            library li = new library();
            li.add_books();
            li.viwe_book();
            li.search("zone");
            li.remove_books("laws and guns");
        }
    }







