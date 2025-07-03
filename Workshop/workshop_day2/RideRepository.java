package workshop_day2;

class RideRepository {
    String[] users = new String[10];
    Ride[][] rides = new Ride[10][];
    int count = 0;

    void addRides(String userId, Ride[] userRides) {
        users[count] = userId;
        rides[count++] = userRides;
    }

    Ride[] getRides(String userId) {
        for (int i = 0; i < count; i++)
            if (users[i].equals(userId)) return rides[i];
        return null;
    }
}

