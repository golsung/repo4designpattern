public class Printer {
    public Printer() {
    }

    public void print1() {
        synchronized (this) {
            for (int i = 0; i < 3; i++)
                System.out.print(i);
        }
    }

    public synchronized void print2() {
        for (int i = 3; i < 6; i++)
            System.out.print(i);

    }


    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread(() -> {
//            try {
//                long sleep = (long) (Math.random() * 100);
//                Thread.sleep(sleep);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            printer.print1();
        }).start();

        new Thread(() -> {
            printer.print2();
        }).start();
    }
}
