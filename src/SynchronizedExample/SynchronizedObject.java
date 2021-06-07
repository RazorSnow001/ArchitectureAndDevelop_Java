package SynchronizedExample;

public class SynchronizedObject {
    public static void main(String[] args) throws InterruptedException {
        ShareObject shareObject = new ShareObject();
        ThreadTest testA = new ThreadTest("great", shareObject);
        ThreadTest testB = new ThreadTest("bad", shareObject);
        Thread threadA = new Thread(testA);
        Thread threadB = new Thread(testB);
        threadA.start();
        Thread.sleep(10000);
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}

