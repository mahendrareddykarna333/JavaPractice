package uk.traditional;


//  Every morning,   A driver will pick the vehicle
// and will fill the fuel tank
// and pick the delivery and deliver the goods to the end customer


class TwoWheeler{

    public void fillTank() {
        System.out.println("Fill fuel for 2-wheeler");
    }

    public void pickFromWareHouse() {
        System.out.println("2-wheeler : PickDelivery From warehouse ");
    }

    public void deliverGoods() {
        System.out.println("2-wheeler: Deliver Goods");
    }
}

class AudiCar {
    public void fillTank() {
        System.out.println("Audi: Fill fuel");
    }
    public void pickFromWareHouse() {
        System.out.println("Audi: PickDelivery From warehouse ");
    }
    public void deliverGoods() {
        System.out.println("Audi: Deliver Goods");
    }
}

class Van {
    public void fillTank() {
        System.out.println("Van: Fill fuel");
    }
    public void pickFromWareHouse() {
        System.out.println("Van: PickDelivery From warehouse ");
    }
    public void deliverGoods() {
        System.out.println("Van: Deliver Goods");
    }
}

public class MyFirstOopsTest {
    public static void main(String args[]) {

        int distanceToWareHouse = 25;

        if(distanceToWareHouse<5) {
            TwoWheeler twoWheeler = new TwoWheeler();
            twoWheeler.fillTank();
            twoWheeler.pickFromWareHouse();
            twoWheeler.deliverGoods();
        } else if(distanceToWareHouse<10){
            AudiCar audiCar = new AudiCar();
            audiCar.fillTank();
            audiCar.pickFromWareHouse();
            audiCar.deliverGoods();
        } else {
            Van van = new Van();
            van.fillTank();
            van.pickFromWareHouse();
            van.deliverGoods();
        }


    }



}
