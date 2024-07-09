package week_7_threads;

public class Main {

    int[] value = {6,3,4,2,6};

    class myThread extends Thread {

        Thread t1 = new myThread();

        public void run() {
            t1.start();
        }
    }
}
