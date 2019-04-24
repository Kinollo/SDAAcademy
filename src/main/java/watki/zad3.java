package watki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zad3 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i<=10) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }


        });

        executorService1.execute((Runnable) ()->{
            int i =0;
            while(i<=10){
                System.out.println(i);
                i++;

            }
        });
    }
}
