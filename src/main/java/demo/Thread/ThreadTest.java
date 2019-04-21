package demo.Thread;

public class ThreadTest {


    public static class ThreadDemo extends Thread{

        @Override
        public void run() {

            String threadName=Thread.currentThread().getName();
            System.out.println(threadName+" isinterrupt flag="+isInterrupted());
            while (!isInterrupted()){
                System.out.println(threadName+" is running!");
                System.out.println(threadName+" isinterrupt flag="+isInterrupted());
            }
            System.out.println(threadName+" isinterrupt flag="+isInterrupted());
        }
    }

    public static class RunnableDemo implements Runnable{
        @Override
        public void run() {

            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Runnable的使用"+Thread.currentThread().isInterrupted());
            }
            System.out.println("Runnable的使用"+Thread.currentThread().isInterrupted());
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadDemo.interrupt();

        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

    }
}
