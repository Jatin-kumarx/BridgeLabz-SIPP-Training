package workshop_day2;

class InvoiceService {
    Invoice generateInvoice(Ride[] rides) {
        double total = 0;
        for (Ride r : rides) total += FareCalculator.calculate(r);
        return new Invoice(rides.length, total);
    }

    Invoice getInvoiceForUser(String userId, RideRepository repo) {
        Ride[] rides = repo.getRides(userId);
        return (rides != null) ? generateInvoice(rides) : new Invoice(0, 0);
    }
}

