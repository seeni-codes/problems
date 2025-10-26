import java.util.ArrayList;

import java.util.Scanner;


class Student_entity{

    private static String name;
    private static int id ;

    public Student_entity(int id ,String name ){
        this.id=id;
        this.name=name;

    }

    public int getid(){
        return id;
    }
    public String name(){
        return  name;
    }

    public String setName(String name) {
        return "id" +id+",name"+name;
    }
}

public class Student{
    public static ArrayList <Student_entity>arr=new ArrayList<>();


    public static void main(String []args){

        Scanner sc=new Scanner(System.in);

        ArrayList <String>arr=new ArrayList<>();
        arr.add("seeni");
        arr.add("viss");
        arr.add("seen");
        arr.add("seenu");



        String option;

        do {
        System.out.println("ENTER YOUR OPTION \n ADD NEW DATA (1) \n UPDATE DATA (2) \n DELETE DATA (3) \n VIEW ALL DATA \n GET EXIT(0) \n");
          option = sc.nextLine();


        switch (option){
            case "0":
                System.out.println("EXIT");
                break;
            case "1":
                System.out.println("ADD NEW DATA");
                add(arr,sc);
                break;
            case "2":
                System.out.println("DELETE EXISTING DATA");
                System.out.println("ENTER THE STUDENT NAME TO DELETE");
                String i=sc.nextLine();
                delete(arr,i);
                break;
            case "3":
                System.out.println("DELETE EXISTING DATA");
                update(arr,sc);
                break;

            case "4":
                System.out.println("SEE EXISTING DATA");
                read(arr);
                break;
            default:
                System.out.println();
        }
        }while (!option .equals("0"));
    }
    public static void add( ArrayList<String> arr, Scanner sc) {

            System.out.println("ENTER YOUR STUDENT NAME:");
            String name = sc.nextLine().toLowerCase();
            arr.add(name);
            read(arr);


    }
//    method to remove value
    public static void delete(ArrayList<String> arr,String i){


        String j;
        int m=-1;
        boolean is=false;
       for(String h:arr){
                j=i;
                is =false;
                if (h.equals(j)) {
                  m= arr.indexOf(h);
                  is =true;

                }

                }
       if(is){
           System.out.println("data not found");
       }

        arr.remove(m);
                System.out.println("updated list");
                for(String k:arr){
                  System.out.println(k);
                }
    }

    //set method
    public static void update(ArrayList<String> arr,Scanner sc){

        System.out.println("ENTER  THE STUDENT NAME TO FIND:");
       String j=sc.nextLine();

        for(String i:arr){
            if (i.equals(j)) {
          System.out.println("ENTER  THE STUDENT NAME TO UPDATE:");
           String  n=sc.nextLine();
            int h=arr.indexOf(i);
                arr.set(h,n);
            }
            else {
                System.out.println("student name not found");
                break;
            }
        }
        System.out.println("updated data");
        for(String k:arr){
            System.out.println(k);
        }
    }

    public static void read( ArrayList<String> arr) {

        System.out.println("ALL STUDENTS DATA");
        for(String j:arr){
            System.out.println(j);
          }


    }


}
