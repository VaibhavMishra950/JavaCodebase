
/*
Threads: Thread is a lightweight process that can execute concurrently with other threads.
         Threads share the same memory space as the main process, but they have their own
         stack and program counter. This allows threads to run independently of each other,
         without blocking the main process.

Threads can be created by:
    => Extending the Thread Class.
        -> Executed using start() method.
    => Implementing the Runnable Interface.
        -> Executed by Creating an object of Thread class, and then we run the start method of
           that Thread.

Life cycle of a Thread:
    1. New  -> Instance of Thread class is created but not started yet.
    2. Runnable  -> After invocation of start() & before it is selected to be run by the scheduler.
    3. Running  -> After thread scheduler has selected it.
    4. Blocked(Non-Runnable)  -> Thread alive, not eligible to run.
    5. Terminated  -> run() method has exited.
 */

class MyThread1 extends Thread{

    public MyThread1(String name){  // Thread Constructor
        super(name);
    }

    @Override
    public void run(){
        int i = 0;
        while (i < 40000){
            System.out.println("Thread 1 Created by extending Thread Class is running.");
            i++;
        }
    }
}

class MyThread2 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 40000){
            System.out.println("Thread 2 Created by implementing Runnable Interface is running.");
            i++;
        }
    }
}

public class CH13_Multithreading {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("Test Name");    // Extended Thread Class
        MyThread2 mt2 = new MyThread2();    // Implemented Runnable Interface
        Thread thrd = new Thread(mt2);

        // Thread Priority
        // In Java, we can explicitly set the priorities of threads we have created
        mt1.setPriority(10);   // Accepts integers from 1 to 10.
        // Java Provides Three Variables for setting priority easily.
        // Thread.MIN_PRIORITY   = 1
        // Thread.NORM_PRIORITY  = 5
        // Thread.MAX_PRIORITY   = 10
        thrd.setPriority(Thread.MIN_PRIORITY);

        // Joining Threads - Blocking Others execution till this one's executed
        try {
            mt1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Interrupting Thread
        try {
            mt1.sleep(45);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // Running Threads
        mt1.start();
        thrd.start();
    }
}
