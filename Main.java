

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //List to store data of customer
        ArrayList<Customer> list = new ArrayList<>();


        boolean condition;
//        System.out.println("Hello world!");


        //Input usr data
        String customerName ;
        int customerAge ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name and age");
        customerName = sc.next();
        customerAge=sc.nextInt();

        //Customer object
        Customer newCustomer = new Customer(customerName, customerAge);
        list.add(newCustomer);

//        System.out.println(customerName);


        //this loop  will iterate over  switch condition of car
do {

    String car;
    System.out.println("Which Car do you want ?");
    System.out.println(" 1 Audi \n 2 Benz \n 3 Mercedes \n 4 Fortuner");
//    new Customer();
    car = sc.next();

    //select car
    switch (car) {
        case "Audi":
            Audi book = new Audi();
            book.isAvailable();
            new Car(1, "Audi");
//            Customer newCustomer = new Customer(customerName, customerAge);
            if (newCustomer.checkLiecense() == true) {
                new RentedCar("Audi");
            } else {
                System.out.println("ja liecense la\n");
            }
            break;


        case "Benz":
            Benz book1 = new Benz();
            book1.isAvailable();
            new Car(2, "Benz");
//            Customer newCustomer1 = new Customer(customerName, customerAge);
            if (newCustomer.checkLiecense() == true) {
                new RentedCar("Benz");
            } else {
                System.out.println("ja liecense la\n");
            }
            break;

        case "Mercedes":
            Mercedes book3 = new Mercedes();
            book3.isAvailable();
            new Car(3, "Mercedes");
//            Customer newCustomer2 = new Customer(customerName, customerAge);
            if (newCustomer.checkLiecense() == true) {
                new RentedCar("Mercedes");
            } else {
                System.out.println("ja liecense la\n");
            }
            break;


        case "Fortuner":
            Fortuner book4 = new Fortuner();
            book4.isAvailable();
            new Car(4, "Fortuner");
//            Customer newCustomer3 = new Customer(customerName, customerAge);
            if (newCustomer.checkLiecense() == true) {
                new RentedCar("FORTUNER");
            } else {
                System.out.println("ja liecense la\n");
            }
            break;


        default:
            System.out.println("enter correct choice");
            break;

    }

    //  switch condition for more  enquiry for car and customer
    System.out.println(" 1. Sir you want one more car \n 2. you are looking for some enquiry \n 3. enter 3 for exit\n 4 Print detail of all customer");
    int temp=sc.nextInt() ;


    //Select for more enquiry
        switch (temp){
            case 1:
                condition=true;
                break;

            case 2:
                condition =true;
                enquiry(newCustomer,new RentedCar(car));
                break;

            case 3:
                condition=false;
                break;
            case 4:
                print(list);
                break;
            default:
                System.out.println("enter valid choice ");
                condition=true;
                break;
        }


        System.out.println("If you want to continue enter true\n ");
        condition=sc.nextBoolean();
    } while (condition);
    }


    //function for enquiry  of Car and Customer
    public static void enquiry(Customer newCustomer,RentedCar car){
        System.out.println("\n\n\n\n");
        System.out.println("1 you want detail of Customer ? \n 2 you want detail of car \n ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();


        switch (temp){
            case 1:
                newCustomer.getDetail();
                break;

            case 2:
                car.getDetail();
                break;

            default:
                System.out.println("Enter valid Choice\n");
                break;

        }

    }
    
    //Print data of Customer
    public static void print(ArrayList<Customer> list){
        for (Customer c1:list) {
            System.out.println(c1.name+"\t"+c1.age);

        }
    }

}