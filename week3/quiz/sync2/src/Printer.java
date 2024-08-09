public class Printer {
    public Printer() {
    }

    public synchronized void print1() {
        for (int i = 0; i < 3; i++) {
            try {
                long sleep = (long) (Math.random() * 100);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
    }

    public  void print2() {
        for (int i = 3; i < 6; i++) {
            try {
                long sleep = (long) (Math.random() * 100);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }


    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread(() -> {
            printer.print1();
        }).start();

        new Thread(() -> {
            printer.print2();
        }).start();
    }
}