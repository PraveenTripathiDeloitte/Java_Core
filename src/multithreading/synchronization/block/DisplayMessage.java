package multithreading.synchronization.block;

public class DisplayMessage {

    public synchronized void sayHello(String name) {
        // Any code can go here

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi! " + name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
