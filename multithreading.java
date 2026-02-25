class T1 extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("T1 : " + i);
        }
    }
}

class T2 extends Thread {

    public void run() {
        for(int i = 6; i <= 10; i++) {
            System.out.println("T2 : " + i);
        }
    }
}

public class multithreading {

    public static void main(String args[]) throws Exception {

        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();   // Start T1
        t1.join();    // Wait until T1 completes

        t2.start();   // Start T2 after T1 finishes
    }
}