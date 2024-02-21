package Shopping;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "Premium");

        // Create a sale
        Sale sale = new Sale(customer, "2024-02-21");

        // Set service and product expenses
        sale.setServiceExpense(100.0);
        sale.setProductExpense(50.0);

        // Display sale information
        sale.displayInfo();
    }
}
