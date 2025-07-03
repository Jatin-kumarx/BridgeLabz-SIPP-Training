package workshop_day2;

class Invoice {
    int totalRides;
    double totalFare, averageFare;

    Invoice(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = totalFare / totalRides;
    }

    void print() {
        System.out.println("Rides: " + totalRides + ", Total Fare: Rs." + totalFare + ", Avg Fare: Rs." + averageFare);
    }
}
