package ex06_design_pattern;

public class Interface Car {
    void assemble() {

    }

}
    public class BasicCar implements Car {
    public void assemble(){
        System.out.println("Basic Car.");

        }

}
public class CarDecorator Car {
    protected Car decoratedCar;

    public CarDecorator(Car c){
        this.decoratedCar = c;
    }
    public void assemble(){
      this.decoratedCar.assemble();
    }
}
public class SportsCar extends CarDecorator {
 public SportsCar(Car c){
     super(c);

 }
 public void assemble(){
     super.assemble();
     System.out.println("adding features of sports Car.");
 }
}