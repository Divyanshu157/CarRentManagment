public class RentedCar {

    String nameCustomer;
    String nameCar;
    Boolean liecense;


    public RentedCar(){

    }
    public RentedCar(String nameCustomer,Boolean liecense){
        this.nameCustomer = nameCustomer;
//        this.nameCar=nameCar;
        this.liecense=liecense;
    }
    public RentedCar(String nameCar){
        this.nameCar=nameCar;

    }


    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getNameCar() {
        return nameCar;
    }

    public Boolean getLiecense() {
        return liecense;
    }

    public void getDetail(){
        System.out.println(getNameCustomer()+"\n"+getNameCar()+"\n"+getLiecense()+"\n");
    }
}
