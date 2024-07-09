package week_7_threads.testing;

import java.util.Arrays;

import static java.lang.Thread.sleep;

class Hello extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try { sleep(1000); } catch (Exception e) {}
        }
    }
}
class Hi extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try { sleep(1000); } catch (Exception e) {}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.start();
        Hi hi = new Hi();
        hi.start();



    }

 }
