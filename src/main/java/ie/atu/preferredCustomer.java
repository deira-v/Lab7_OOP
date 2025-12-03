package ie.atu;

public class preferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    //default constructor
    public preferredCustomer(int loyaltyPoints, double discountLevel) {
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public preferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "preferredCustomer{" +
                "loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}
