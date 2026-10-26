class TicketCounter {
    private int tickets = 10;

    public synchronized boolean bookTickets(String customerName, int requested) {
        if (requested > tickets) {
            System.out.println(customerName + " could not book " + requested + " tickets; only " + tickets + " remain.");
            return false;
        }

        tickets -= requested;
        System.out.println(customerName + " booked " + requested + " tickets. Remaining: " + tickets);
        return true;
    }

    public synchronized int getRemainingTickets() {
        return tickets;
    }
}

class Customer extends Thread {
    private final TicketCounter counter;

    Customer(String name, TicketCounter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.bookTickets(getName(), 4);
    }
}

public class TicketBooking {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter = new TicketCounter();
        Thread[] customers = {
            new Customer("Customer 1", counter),
            new Customer("Customer 2", counter),
            new Customer("Customer 3", counter)
        };

        for (Thread customer : customers) {
            customer.start();
        }
        for (Thread customer : customers) {
            customer.join();
        }

        System.out.println("Final remaining tickets: " + counter.getRemainingTickets());
    }
}
