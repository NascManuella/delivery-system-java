package entities;

public class BikeDelivery implements DeliveryService {

    @Override
    public double calculateFee(double distance) {
        return distance * 1.0;
    }
}