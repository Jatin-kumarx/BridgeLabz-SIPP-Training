package workshop_day2;

class FareCalculator {
    static double calculate(Ride ride) {
        double ratePerKm = ride.type.equals("PREMIUM") ? 15 : 10;
        double ratePerMin = ride.type.equals("PREMIUM") ? 2 : 1;
        double minFare = ride.type.equals("PREMIUM") ? 20 : 5;

        double fare = ride.distance * ratePerKm + ride.time * ratePerMin;
        return Math.max(fare, minFare);
    }
}

