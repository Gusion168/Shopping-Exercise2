package Shopping;

public class Customer implements IDiscountRate {
    // Members
    private String cusName;
    private String cusType;

    // Constructor
    public Customer(String cusName, String cusType) {
        this.cusName = cusName;
        this.cusType = cusType;
    }

    // Getters and Setters
    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    // Implementation of IDiscountRate interface methods
    @Override
    public double getServiceDiscountRate() {
        switch (cusType.toLowerCase()) {
            case "premium":
                return 0.2; // 20% discount for premium
            case "gold":
                return 0.15; // 15% discount for gold
            case "silver":
                return 0.1; // 10% discount for silver
            default:
                return 0.0; // 0% discount for other types
        }
    }

    @Override
    public double getProductDiscountRate() {
        switch (cusType.toLowerCase()) {
            case "premium":
            case "gold":
            case "silver":
                return 0.1; // 10% discount for premium, gold, silver
            default:
                return 0.0; // 0% discount for other types
        }
    }
}
