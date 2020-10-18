package practice3;

public class Laptop {   // parametization of constructor

    int year ;
    String model ;

    // default constructor
    public Laptop (){

    }
    public Laptop (int year, String model){
        this.year = year;
        this.model= model;


    }
    public void PrintDetail (){
        System.out.println(year);// sout    ---->shortcut
        System.out.println(model);

    }

        public static void main(String[] args) {   // psvm ----> shortcut
        //Laptop laptop = new Laptop();
       Laptop print = new Laptop();
       print.PrintDetail();


    }
}
