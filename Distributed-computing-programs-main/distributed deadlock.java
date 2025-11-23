class Resource { }

public class DeadlockDemo {
    public static void main(String[] args) {

        Resource A = new Resource();  // Resource at Site 1
        Resource B = new Resource();  // Resource at Site 2

        Thread site1 = new Thread(() -> {
            synchronized (A) {
                System.out.println("Site 1 locked A");
                try { Thread.sleep(100); } catch (Exception e) {}
                System.out.println("Site 1 waiting for B");
                synchronized (B) { }
            }
        });

        Thread site2 = new Thread(() -> {
            synchronized (B) {
                System.out.println("Site 2 locked B");
                try { Thread.sleep(100); } catch (Exception e) {}
                System.out.println("Site 2 waiting for A");
                synchronized (A) { }
            }
        });

        site1.start();
        site2.start();
    }
}

Output
Site 1 locked A
Site 2 locked B
Site 1 waiting for B
Site 2 waiting for A
