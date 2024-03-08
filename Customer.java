import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);

    String name;
    int age;
//    Boolean liecense;
    public Customer(){

//        System.out.println("enter your name aa");
//        name=sc.next();
//        age = sc.nextInt();

    }

    public Customer(String name,  int age){

        this.name=name;
//        this.age=age;
        this.age =age;
    }
    public boolean checkLiecense(){
//        if (liecense==true){
//            System.out.println("Enjoy your ride \n");
//            return true;
//        }else{
//            System.out.println("Sorry you are Not eligible \n");
//            return false;
//
//        }
        boolean temp;

        System.out.println("Do you have liecense write true or false \n");
        temp=sc.hasNextBoolean();
        if (temp==true) {
            System.out.println("enjoy your ride");
            new RentedCar(name,true);
            return true;
        }
        else{
            System.out.println("Beta ja liecesence bnwa\n");
            new RentedCar(name,false);
            return false;
        }

    }
    public  void getDetail(){
        System.out.println(name +"\t"+ age);
    }

}

