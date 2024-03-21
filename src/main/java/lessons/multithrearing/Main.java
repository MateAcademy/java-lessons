package lessons.multithrearing;

import java.util.concurrent.Semaphore;

/**
 * Семафоры: люди приходят в ресторан - это потоки, люди/потоки просят столик/Семафор,
 * и мы можем либо давать им или не давать
 *
 * Семафоры это такой класс в многопоточном программировании который помогает работать с несколькими одновременно
 * ресурсами
 * Таким образом мы можем выделять разное количество ресурсов на разные потоки и работать с ними
 */
public class Main {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);

        Person person1 = new Person(table);
        Person person2 = new Person(table);
        Person person3 = new Person(table);

        person1.start();
        person2.start();
        person3.start();
    }
}

class Person extends Thread {
    Semaphore table;

    public Person(Semaphore table) {
        this.table = table;
    }

    @Override
    public void run() {
        System.out.println("Person waiting for table" +  this.getName());
        try {
            //просим столик - мы получаем какойто ресурс/лок
            table.acquire();
            System.out.println("Человет кушает за столом" +  this.getName());
            Thread.sleep(1000);
            System.out.println("Человек освобождает столик " + this.getName());
            table.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
