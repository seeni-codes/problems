import java.util.*;

public class book {
    public List<book > list=new LinkedList<>();



        private int id ;
        private String title;

        public book(int id,String title){
            this.id=id;
            this.title=title;
        }

        public int  getId(){return id;}
        public String gettitle(){return title;}




    public void add_books(int id, String title) {
        list.add(new book(1, "limitless"));
        list.add(new book(2, "zero to one"));
        list.add(new book(3, "think straight"));
        list.add(new book(4, "48 laws"));
        list.add(new book(5, "laws and guns"));
//        list.add(new books(id, title));


    }

    public void search(String booke) {

        boolean is = false;
        for (book b : list) {
            if (b.gettitle().equals(booke)) {
                is = true;
                break;
            }
        }
        if (!is) {
            System.out.println(booke + " is found ");
        } else {
            System.out.println(booke + " not found");
        }
    }


    public static void main (String[]args){
        book bo=new book(4,"ggd");
        String i="laws and";
        bo.search(i);

    }
}