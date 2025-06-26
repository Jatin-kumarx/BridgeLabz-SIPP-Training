public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }
    void displayTicket() {
        System.out.println("Movie     : " + movieName);
        System.out.println("Seat No.  : " + seatNumber);
        System.out.println("Price     : ₹" + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers", 12, 250);
        ticket.displayTicket();
    }
}
