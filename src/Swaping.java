public class Swaping {


        public static void main(String [] args){

            Swaping sap=new Swaping();
            int a=2;
            int b=9;
            System.out.println("before swaping:\na="+a+"\nb="+b);


            //third variable
            sap.third_var(a, b);

            //operator swap
            sap.oper_swap(a,b);
        }

        //using third variable to swap the number
        public void third_var(int a, int b){

            int temp=a;
            a=b;
            b=temp;
            System.out.println("\nthird variable swaping:\na="+a+"\nb="+b);
        }

        //using operators to swap
        public void oper_swap(int a,int b){
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("\nusing operator swaping:\na="+a+"\nb="+b);
        }




    }

