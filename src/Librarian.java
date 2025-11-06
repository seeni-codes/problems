import java.util.*;



class books{
    private final int id ;
    private final String  title;

    public books(int id,String title){
        this.id=id;
        this.title=title;
    }

    public int  getId(){return id;}
    public String gettitle(){return title;}

}


//library class
class library {
    public List<books> list = new LinkedList<>();

    public void add_books(int id,String title) {
        list.add(new books(1, "limitless"));
        list.add(new books(2, "zero to one"));
        list.add(new books(3, "think straight"));
        list.add(new books(4, "48 laws"));
        list.add(new books(5, "laws and guns"));
        list.add(new books(id, title));

        for (books i : list) {
            System.out.println(i.getId() + "-" + i.gettitle()+"\n");
        }

    }

    //view book
    public void view_book(boolean is) {
        if(is) {
            for (books i : list) {
                System.out.println(i.getId() + "-" + i.gettitle());
            }
        }
    }

    //search book
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

    //remove book
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
            view_book(true);
        }
        else {
            System.out.println(book+" removed and updated \n");
            view_book(true);

        }

    }
}

    class librar extends library{
    public Scanner scan=new Scanner(System.in);
    public library li=new library();
    public void add(){
        System.out.println("Enter the title of the book:");
        String i= scan.nextLine();

        int r=23;
        li.add_books(r,i);
        li.view_book(true);

    }






}


    public class Librarian {
        public static void main(String[] args) {

            library li = new library();
            librar ly = new librar();
            Scanner sc = new Scanner(System.in);
            System.out.println("user 1\nlibrarian 2\nenter the option:");
            int option = sc.nextInt();
            sc.nextLine();// nextline
            if (option == 1) {
                user ui=new user();
                ui.user_method();
            }else {

                String choice = "";

                while (!choice.equals("0")) {
                    System.out.println("Add books 1\nview books 2\nremove books 3\nsearch book 4\n ");
                    System.out.println("choice:");
                    choice = sc.nextLine();

                    switch (choice) {
                        case "1":
                            ly.add();
                            break;
                        case "2":
//                            ly.view_book();
                            ly.add_books(34,"title of the life");
                           break;
                        case "3":
                            System.out.println("enter the title to remove:");
                            String in = sc.nextLine();
                            li.remove_books(in);
                            break;
                        case "4":
                            System.out.println("enter the title to search:");
                            String scr = sc.nextLine();
                            li.search(scr);
                            break;
                    }
                }
            }
        }
    }







