import java.util.LinkedList;

public class Industrial {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 50;

    public void produce() {
        int value = 1;

        while (true) {
            synchronized (this) {

                while (list.size() == capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer produced-" + value);
                list.add(value++);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (this) {

                while (list.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int val = list.removeFirst();
                System.out.println("Consumer consumed-" + val);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
