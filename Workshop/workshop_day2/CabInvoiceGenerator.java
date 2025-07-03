package workshop_day2;

public class CabInvoiceGenerator {
    public static void main(String[] args) {
        RideRepository repo = new RideRepository();
        InvoiceService service = new InvoiceService();

        repo.addRides("user1", new Ride[]{
            new Ride(2, 5, "NORMAL"),
            new Ride(0.1, 1, "NORMAL")
        });

        repo.addRides("user2", new Ride[]{
            new Ride(5, 10, "PREMIUM"),
            new Ride(3, 5, "PREMIUM")
        });

        System.out.println("Invoice for user1:");
        service.getInvoiceForUser("user1", repo).print();

        System.out.println("Invoice for user2:");
        service.getInvoiceForUser("user2", repo).print();
    }
}

