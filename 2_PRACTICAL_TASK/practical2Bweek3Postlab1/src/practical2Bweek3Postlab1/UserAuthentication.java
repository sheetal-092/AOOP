package practical2Bweek3Postlab1;

public class UserAuthentication {
	private static UserAuthentication instance = null;
    private boolean isAuthenticated;

    private UserAuthentication() {
        isAuthenticated = false;
    }

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login() {
        if (!isAuthenticated) {
            isAuthenticated = true;
            System.out.println("User successfully authenticated.");
        } else {
            System.out.println("User is already authenticated.");
        }
    }

    public void logout() {
        if (isAuthenticated) {
            isAuthenticated = false;
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}


abstract class Vehicle {
    public abstract void requestRide();
}

class Car extends Vehicle {
    public void requestRide() {
        System.out.println("Car ride requested.");
    }
}

class Bike extends Vehicle {
    public void requestRide() {
        System.out.println("Bike ride requested.");
    }
}

class Scooter extends Vehicle {
    public void requestRide() {
        System.out.println("Scooter ride requested.");
    }
}

class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Scooter":
                return new Scooter();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via Credit Card.");
    }
}

class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via PayPal.");
    }
}

class GooglePay implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via Google Pay.");
    }
}

interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}

class CreditCardFactory implements PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}

class PayPalFactory implements PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}

class GooglePayFactory implements PaymentFactory {
    public PaymentMethod createPaymentMethod() {
        return new GooglePay();
    }
}
