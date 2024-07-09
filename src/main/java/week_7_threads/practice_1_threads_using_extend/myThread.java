package week_7_threads.testing;

public class myThread extends Thread {

     int [] value = {7,4,2,5,7,3,2,6};

    public void run() {
        for (int i = 0; i < value.length; i++) {
            value[i] = value[i] * 2;
            System.out.println(value[i]);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        myThread t1 = new myThread();
        t1.start();

        myThread t2 = new myThread();
        t2.sleep(3000);
    }
}
