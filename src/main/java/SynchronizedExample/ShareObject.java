package SynchronizedExample;

public class ShareObject {
    public void send(String message) {
        System.out.println(message);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + message + "Sent");
    }
}

