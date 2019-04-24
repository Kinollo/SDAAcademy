package watki.zad5;

public class Main extends Thread {


    @Override
    public void run() {
        System.out.println("Początek wątku");
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Koniec wątku");
    }

    public static void main(String[] args) {

        Main t = new Main();
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();
        Main t4 = new Main();
        Main t5 = new Main();

        t.start();

        try
        {
            System.out.println("Wątek: "
                    + Thread.currentThread().getName());
            t.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        t1.start();

        try{
            System.out.println("Wątek " + Thread.currentThread().getName());
            t1.join();
        }

        catch (Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        t2.start();

        try{
            System.out.println("Wątek " + Thread.currentThread().getName());
            t2.join();
        }

        catch (Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        t3.start();

        try{
            System.out.println("Wątek " + Thread.currentThread().getName());
            t3.join();
        }

        catch (Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        t4.start();

        try{
            System.out.println("Wątek" + Thread.currentThread().getName());
            t4.join();
        }

        catch (Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        t5.start();

        try {
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
