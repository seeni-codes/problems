public class Percentage {


        public static void main(String []args){

            Percentage per=new Percentage();



            //double i=(percent/100)*value  //find the value to given percentage
            double value=300;
            double percent=34;
            double result=percent/100*value;
            System.out.println(percent+"% of "+value+" = "+result);

            per.percent(value);
        }

        public void percent(double value){
            //double per=(percent/value)*100  //find the percentage to given value
            double value2=200;
            double per= value2/value*100;
            System.out.println(value2+"% of "+value+" = "+per);
        }
    }

