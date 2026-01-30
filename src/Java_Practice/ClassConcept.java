package Java_Practice;

class Car{
    String brandName;
    int yearOfManf;
    public void drive(){
        System.out.println("Driving Car");
    }
    public void carDeatils(){
        System.out.println("This is brand new "+brandName+" and "+yearOfManf+" year");
    }
}
public class ClassConcept {
    public static void main(String[] args) {

        Car swift = new Car();
        swift.brandName="Maruti Suzuki";
        swift.yearOfManf=2002;
        swift.drive();
        swift.carDeatils();
    }
}
