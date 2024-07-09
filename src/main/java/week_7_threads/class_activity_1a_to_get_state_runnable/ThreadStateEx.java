package week_7_threads.class_activity_1a_;

public class ThreadStateEx implements  Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        System.out.println("The state of thread t1 while it invoked the join() method on thread t2" + ThreadState.t1.getState());


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

