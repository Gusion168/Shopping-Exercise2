package Shopping;

public class Sale {
    // Members
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    // Constructor
    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    // Method to calculate total expense
    public double getTotalExpense() {
        double discountedServiceExpense = Sale.getServiceDiscountedPrice(serviceExpense, customer);
        double discountedProductExpense = Sale.getProductDiscountedPrice(productExpense, customer);

        return discountedServiceExpense + discountedProductExpense;
    }

    // Method to display sale information
    public void displayInfo() {
        System.out.println("=====================================================");
        System.out.println("Sale Date: " + date);
        System.out.println("Customer Name: " + customer.getCusName());
        System.out.println("Customer Type: " + customer.getCusType());
        System.out.println("Service Expense: " + serviceExpense);
        System.out.println("Product Expense: " + productExpense);
        System.out.println("Total Expense: " + getTotalExpense());
        System.out.println("=====================================================");
    }

    // Static method to calculate discounted price for service
    public static double getServiceDiscountedPrice(double originalPrice, Customer customer) {
        return originalPrice * (1 - customer.getServiceDiscountRate());
    }

    // Static method to calculate discounted price for product
    public static double getProductDiscountedPrice(double originalPrice, Customer customer) {
        return originalPrice * (1 - customer.getProductDiscountRate());
    }
}
