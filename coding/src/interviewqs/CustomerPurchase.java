package interviewqs;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Customer{
    private int cusId;
    private String cusName;
    private String cusMail;

    public Customer(int cusId, String cusName, String cusMail) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusMail = cusMail;
    }

    public int getCusId() {
        return cusId;
    }

    public String getCusName() {
        return cusName;
    }

    @Override
    public String toString() {
        return "Customer{cusId=" + cusId + ", cusName='" + cusName + "', cusMail='" + cusMail + "'}";
    }
}

    public class CustomerPurchase {
        public static void main(String[] args) {
            // Customer table
            List<Customer> customers = Arrays.asList(
                    new Customer(1, "Alice", "alice@example.com"),
                    new Customer(2, "Bob", "bob@example.com"),
                    new Customer(3, "Charlie", "charlie@example.com")
            );

            // Purchase table
            List<Purchase> purchases = Arrays.asList(
                    new Purchase(101, 1, LocalDate.of(2023, 1, 15), 200.0),
                    new Purchase(102, 2, LocalDate.of(2023, 1, 15), 100.0),
                    new Purchase(103, 1, LocalDate.of(2023, 2, 10), 300.0),
                    new Purchase(104, 3, LocalDate.of(2023, 1, 20), 150.0)
            );

            // Step 1: Convert Customer List to Map
            Map<Integer, Customer> customerMap = customers.stream()
                    .collect(Collectors.toMap(Customer::getCusId, customer -> customer));

            // Step 2: Filter purchases after a specific date and get customer details
            LocalDate filterDate = LocalDate.of(2023, 1, 15);

            List<Customer> filteredCustomers = purchases.stream()
                    .filter(p -> p.getPurchaseDate().isAfter(filterDate)) // Filter purchases by date
                    .map(Purchase::getCusId) // Extract customer IDs
                    .distinct() // Remove duplicates
                    .map(customerMap::get) // Lookup customer details from the map
                    .toList();

            System.out.println("Customers who purchased after " + filterDate + ":");
            filteredCustomers.forEach(System.out::println);

            LocalDate date = LocalDate.of(2023, 1, 15);
            List<Purchase> list = purchases.stream().filter(p -> p.getPurchaseDate().isAfter(date)).toList();
            list.forEach(System.out::println);
            purchases.stream().sorted(Comparator.comparing(Purchase::getPurchaseDate));
        }
    }
