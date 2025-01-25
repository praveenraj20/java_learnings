package interviewqs;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Purchase {
        private int purId;
        private int cusId;
        private LocalDate purchaseDate;
        private double amount;

        public Purchase(int purId, int cusId, LocalDate purchaseDate, double amount) {
            this.purId = purId;
            this.cusId = cusId;
            this.purchaseDate = purchaseDate;
            this.amount = amount;
        }

        public int getCusId() {
            return cusId;
        }

        public LocalDate getPurchaseDate() {
            return purchaseDate;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Purchase{purId=" + purId + ", cusId=" + cusId +
                    ", purchaseDate=" + purchaseDate + ", amount=" + amount + "}";
        }
}

public class PurchaseSorter {
    public static void main(String[] args) {

        List<Purchase> purchases = Arrays.asList(
                new Purchase(101, 1, LocalDate.of(2023, 1, 15), 200.0),
                new Purchase(102, 2, LocalDate.of(2023, 1, 15), 100.0),
                new Purchase(103, 1, LocalDate.of(2023, 2, 10), 300.0),
                new Purchase(104, 3, LocalDate.of(2023, 1, 20), 150.0)
        );
        purchases.sort(Comparator.comparing(Purchase::getPurchaseDate)
                .thenComparing(Purchase::getAmount));
        System.out.println("Sorted Purchases:");
        purchases.forEach(System.out::println);
    }
}


