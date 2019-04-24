package watki.zad3bis;

public class zad3bis implements Runnable {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        (new Thread(new zad3bis())).start();
        (new Thread(new zad3bis())).start();
    }
}
