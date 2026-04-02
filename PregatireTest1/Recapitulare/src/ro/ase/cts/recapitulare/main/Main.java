package ro.ase.cts.recapitulare.main;

import ro.ase.cts.recapitulare.singleton.Restaurant;

public class Main {
    static void main(String[] args) {

      Thread thread1 = new Thread(new Runnable() {
          @Override
          public void run() {
            Restaurant r1 = Restaurant.getInstanta("restaurantA",10,50);
              System.out.println(r1.hashCode());
          }
      });

      Thread thread2 = new Thread(new Runnable() {
          @Override
          public void run() {
              Restaurant r2 = Restaurant.getInstanta("restaurantB",10,50);
                System.out.println(r2.hashCode());
          }
        });
      thread1.start();
      thread2.start();
    }
}
