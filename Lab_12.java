import java.util.ArrayList;
import java.util.List;

abstract class Delivery{
    String name;
    List <String> accessories = new ArrayList();
    public String toString(){
        return "Delivery: " + name + "\n" + accessories;
    }
}

abstract class DeliveryWay{
    public abstract Delivery createDelivery();

}

class AirDeliveryWay extends DeliveryWay{
    public Delivery createDelivery(){
        return new AirDelivery();
    }

}

class RoadDeliveryWay extends DeliveryWay{
    public Delivery createDelivery(){
        return new RoadDelivery();
    }

}

class SeaDeliveryWay extends DeliveryWay{
    public Delivery createDelivery(){
        return new SeaDelivery();
    }

}

class AirDelivery extends Delivery{
    public AirDelivery(){
        accessories.add("Plane");
        accessories.add("Helicopter");
        name = "Air";
    }
}

class RoadDelivery extends Delivery{
    public RoadDelivery(){
        accessories.add("Truck");
        accessories.add("Wagon");
        name = "Road";
    }
}

class SeaDelivery extends Delivery{
    public SeaDelivery(){
        accessories.add("Steamer");
        accessories.add("Boat");
        name = "Sea";
    }
}

public class Lab_12 {
    public static void main(String[] args) {
        DeliveryWay AirWay = new AirDeliveryWay();
        DeliveryWay RoadWay = new RoadDeliveryWay();
        DeliveryWay SeaWay = new SeaDeliveryWay();

        Delivery AirDelivery = AirWay.createDelivery();
        Delivery RoadDelivery = RoadWay.createDelivery();
        Delivery SeaDelivery = SeaWay.createDelivery();

        System.out.println(AirDelivery);
        System.out.println(RoadDelivery);
        System.out.println(SeaDelivery);
    }
}
