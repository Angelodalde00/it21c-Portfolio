
package prajek;

//DINAKO UY
public class Car {
    String car_name;
    double car_price;
    
    Car(String car_name,double car_price){
    this.car_name = car_name;
    this.car_price = car_price;
    }
    void showCarName(){
        System.out.println(car_name +"Sinaw morag ikaw ");
        
    }
    void showCarModel(){
        System.out.println(car_price + "Mahal pero mas mahala tika yiee <3 ");
    }
}
