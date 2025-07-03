package workshop_day2;

class Ride {
    double distance;
    int time;
    String type; // "NORMAL" or "PREMIUM"

    Ride(double distance, int time, String type) {
        this.distance = distance;
        this.time = time;
        this.type = type;
    }
}
