package multithreading.synchronization;

public class ThreadClass extends Thread {

    DisplayMessage displayMessage;
    String name;

    public ThreadClass(DisplayMessage displayMessage, String name) {
        this.displayMessage = displayMessage;
        this.name = name;
    }

    public void run() {
        displayMessage.sayHello(name);
    }
}
