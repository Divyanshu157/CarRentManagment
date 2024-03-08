
public class Car {

    int number;
    String name;

//    float model;
//    boolean present;

    public Car(){

    }
    public Car(int number,String name ){
        this.number=number;
        this.name=name;
//        this.present=present;

    }



}
class Audi extends Car{
    Boolean availablity=false;

    public Audi(){
        availablity=true;

    }

    public  void  isAvailable(){
        if (availablity==true){
            System.out.println("Yes available . Now show me your liecense\n");
            availablity=false;
        }else {
            System.out.println("Sorry you can chose another car");
        }
    }
}

class Benz extends Car{
    Boolean availablity;

    public Benz(){
        availablity=true;
    }
    public  void  isAvailable(){
        if (availablity==true){
            System.out.println("Yes available . Now show me your liecense\n");
            availablity=false;

        }else {
            System.out.println("Sorry you can chose another car");
        }
    }
}
class Mercedes extends Car{
    Boolean availablity;

    public Mercedes(){
        availablity=true;

    }

    public  void  isAvailable(){
        if (availablity==true){
            System.out.println("Yes available . Now show me your liecense\n");
            availablity=false;


        }else {
            System.out.println("Sorry you can chose another car");

        }

    }


}
class Fortuner extends Car{
    Boolean availablity;

    public Fortuner(){
        availablity=true;

    }

    public  void  isAvailable(){
        if (availablity==true){
            System.out.println("Yes available . Now show me your liecense\n");
            availablity=false;


        }else {
            System.out.println("Sorry you can chose another car");

        }

    }


}


