package Shopping;

public class Main {
    public static void main(String[] args) {
        // Create a customer class
        Customer customer1 = new Customer("John Doe", "Premium");
        Customer customer2 = new Customer("Seav Long","gold");
        Customer customer3 = new Customer("Jeata","silver");

        // Create a sale
        Sale sale1 = new Sale(customer1, "2024-02-21");
        Sale sale2 = new Sale(customer2, "2024-02-21");
        Sale sale3 = new Sale(customer3, "2024-02-21");

        // Set service and product expenses
        sale1.setServiceExpense(100.0);
        sale1.setProductExpense(50.0);

        sale2.setServiceExpense(100.0);
        sale2.setProductExpense(50.0);

        sale3.setServiceExpense(100.0);
        sale3.setProductExpense(50.0);

        // Display sale information
        System.out.println("=====================================================");
        sale1.displayInfo();
        sale2.displayInfo();
        sale3.displayInfo();
        System.out.println("=====================================================");
    }
}
