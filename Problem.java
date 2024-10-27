class Buffer {
    private int[] buffer;
    private int size;
    private int count;

    public Buffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.count = 0;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (count == size) {
            wait();
        }

        buffer[count] = item;
        count++;

        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            wait();
        }

        int item = buffer[count - 1];
        count--;

        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000); // Simulating production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                int item = buffer.consume();
                Thread.sleep(1500); // Simulating consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Problem {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(2);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
