class sample extends Thread {
    private String message;
    private int interval;
    public sample(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        sample t1 = new sample("BMS College of Engineering", 10000);
        sample t2 = new sample("CSE", 2000);
        t1.start();
        t2.start();
    }
}
