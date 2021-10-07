package uk.using.oops;


//  Every morning,   A driver will pick the vehicle
// and will fill the fuel tank
// and pick the delivery and deliver the goods to the end customer


class TwoWheeler implements Vehicle{

    public void fillTank() {
        System.out.println("Fill fuel for 2-wheeler");
    }

    public void pickFromWareHouse() {
        System.out.println("2-wheeler : PickDelivery From warehouse ");
    }

    public void deliverGoods() {
        System.out.println("2-wheeler: Deliver Goods");
    }

    @Override
    public void checkCustomerPresence() {

    }
}

class AudiCar implements Vehicle{
    public void fillTank() {
        System.out.println("Audi: Fill fuel");
    }
    public void pickFromWareHouse() {
        System.out.println("Audi: PickDelivery From warehouse ");
    }
    public void deliverGoods() {
        System.out.println("Audi: Deliver Goods");
    }

    @Override
    public void checkCustomerPresence() {

    }
}

class Van implements Vehicle{
    public void fillTank() {
        System.out.println("Van: Fill fuel");
    }
    public void pickFromWareHouse() {
        System.out.println("Van: PickDelivery From warehouse ");
    }
    public void deliverGoods() {
        System.out.println("Van: Deliver Goods");
    }

    @Override
    public void checkCustomerPresence() {

    }
}

class Skoda implements Vehicle{
    public void fillTank() {
        System.out.println("Van: Fill fuel");
    }
    public void pickFromWareHouse() {
        System.out.println("Van: PickDelivery From warehouse ");
    }
    public void deliverGoods() {
        System.out.println("Van: Deliver Goods");
    }

    @Override
    public void checkCustomerPresence() {

    }
}

class Ferari implements Vehicle{
    public void fillTank() {
        System.out.println("Van: Fill fuel");
    }
    public void pickFromWareHouse() {
        System.out.println("Van: PickDelivery From warehouse ");
    }
    public void deliverGoods() {
        System.out.println("Van: Deliver Goods");
    }

    @Override
    public void checkCustomerPresence() {

    }
}

public class MyFirstOopsTest {
    public static Vehicle getVehicle(int distanceToWareHouse) {
        if (distanceToWareHouse < 5) {
            return new TwoWheeler();
        } else if (distanceToWareHouse < 10) {
            return new AudiCar();
        } else if (distanceToWareHouse < 20){
            return new Van();
        } else if(distanceToWareHouse < 30){
            return new Skoda();
        } else {
            return new Ferari();
        }
    }

    public static void main(String args[]) {
        Vehicle vehicle = getVehicle(80);
        vehicle.fillTank();
        vehicle.pickFromWareHouse();
        vehicle.checkCustomerPresence();
        vehicle.deliverGoods();
    }

    // John Lewis , customers payments
    // all of sudden that payment provider is stopped working
    // will try to use other payment provider


}
