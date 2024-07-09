package week_7_threads.class_activity_1a_;

public class ThreadState implements Runnable {

    public static Thread t1;

    public static ThreadState obj1;

    public void run() {
        ThreadStateEx threadStateEx = new ThreadStateEx();
        Thread t2 = new Thread(threadStateEx);

        // thread t2 is created and it is currently not in NEW state.
        System.out.println("The state of thread t2 after spawning it -" + t2.getState());
        t2.start();


        // Thread t2 is moved to the runnable state
        System.out.println("the state of thread t2 after calling the method start() on it " + t2.getState());

        try{
            //moving a thread t1 to the time waiting state
            Thread.sleep(200);} catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("the state of thread t2 after calling the method sleep() on it " + t2.getState());
        t2.getState();

        try {
            // waiting for thread t2 to complete it's execution
            t2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("the state of thread t2 after calling the method join() on completing it's execution"+ t2.getState());

    }
    public static void main(String[] args){
        obj1 = new ThreadState();
        t1= new Thread(obj1);

        //the  thread t1 is currently in the start method on t1
        System.out.println("The state of thread t1 after creating it - " + t1.getState());


        //invoke the start method on t1
        t1.start();
        System.out.println("The state of the t1 after invoking start() method - " + t1.getState());
    }
}
