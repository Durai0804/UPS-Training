class NumberBuffer {
    private int number;
    private boolean available;
    private boolean finished;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        number = value;
        available = true;
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized Integer consume() throws InterruptedException {
        while (!available && !finished) {
            wait();
        }
        if (!available && finished) {
            return null;
        }

        int value = number;
        available = false;
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }

    public synchronized void finish() {
        finished = true;
        notifyAll();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        NumberBuffer buffer = new NumberBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int number = 1; number <= 5; number++) {
                    buffer.produce(number);
                }
                buffer.finish();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                buffer.finish();
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            try {
                while (buffer.consume() != null) {
                    // The consumed number is displayed by NumberBuffer.
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer");

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
