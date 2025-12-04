package ie.atu;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    //discount ranges
    private void updateDiscountLevel() {

        if (loyaltyPoints < 500) {
            this.discountLevel = 0.00;
        }
        else if (loyaltyPoints >= 500 && loyaltyPoints < 1000) {
            this.discountLevel = 0.05;
        }
        else if (loyaltyPoints >= 1000 && loyaltyPoints < 1500) {
            this.discountLevel = 0.06;
        }
        else if (loyaltyPoints >= 1500 && loyaltyPoints < 2000) {
            this.discountLevel = 0.07;
        }
        else if (loyaltyPoints >= 2000) {
            this.discountLevel = 0.1;
        }
    }

    //update loyalty points and get discounts
    public void addLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints += loyaltyPoints;
        updateDiscountLevel();
    }

    //default constructor
    public PreferredCustomer(int loyaltyPoints, double discountLevel) {
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    //parameterized constructor
    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    //helper mode / no-argument Constructor
    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    //Setters / Getters
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    //toString
    @Override
    public String toString() {
        return "Customer = " + super.toString() +
                "loyaltyPoints =" + loyaltyPoints +
                ", discountLevel =" + discountLevel +
                "'.";
    }
}
