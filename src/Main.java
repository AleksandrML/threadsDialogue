public class Main {
    public static void main(String[] args) throws InterruptedException {
        // let's work through threadGroup
        ThreadGroup threadGroup = new ThreadGroup("threadGroup");

        Thread thread = new MyThread(threadGroup, "Поток 1");
        Thread thread2 = new MyThread(threadGroup, "Поток 2");
        Thread thread3 = new MyThread(threadGroup, "Поток 3");
        Thread thread4 = new MyThread(threadGroup, "Поток 4");
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(15_000);
        threadGroup.stop();
    }
}