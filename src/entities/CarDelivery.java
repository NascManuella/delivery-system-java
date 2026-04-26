package entities;

public class CarDelivery implements DeliveryService{
	
	@Override
	public double calculateFee(double distance) {
		return distance * 1.0;
	}
}
