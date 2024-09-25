package practical2Bweek3Postlab1;

public class RideSharingApp {
	 public static void main(String[] args) {
	        UserAuthentication auth = UserAuthentication.getInstance();
	        
	        auth.login();
	        
	        if (auth.isAuthenticated()) {
	            Vehicle car = VehicleFactory.createVehicle("Car");
	            car.requestRide();

	            PaymentFactory paymentFactory = new CreditCardFactory();
	            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
	            paymentMethod.processPayment(20.0);
	        }
	        
	        auth.logout();
	        
	        auth.login();
	        
	        if (auth.isAuthenticated()) {
	            Vehicle bike = VehicleFactory.createVehicle("Bike");
	            bike.requestRide();

	            PaymentFactory paymentFactory = new GooglePayFactory();
	            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
	            paymentMethod.processPayment(5.0);
	        }
	        
	        auth.logout();
	    }
}
