package SynchronizedExample;

public class ThreadTest implements Runnable {
    private String message;
    ShareObject shareObject;

    public ThreadTest(String message, ShareObject shareObject) {
        this.message = message;
        this.shareObject = shareObject;
    }

    @Override
    public void run() {
        synchronized (shareObject) {
            shareObject.send(message);
        }
        /* shareObject.send(message);*/
    }
}
