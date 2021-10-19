public class Main {
    public static void main(String[] args) throws InterruptedException {
        Industrial industrial = new Industrial();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                industrial.produce();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                industrial.consume();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
