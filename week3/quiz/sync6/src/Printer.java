public class Printer {
    public Printer() {
    }

    public static void print1() {
        synchronized (Printer.class) {
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
    }

    public synchronized static void print2() {
        for (int i =3; i < 6; i++) {
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
            try {
                long sleep = (long) (Math.random() * 100);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Printer.print1();
        }).start();

        new Thread(() -> {
            printer.print2();
        }).start();
    }
}

//public class Printer {
//    public Printer() {
//    }
//    private static Object obj = new Object();
//    public static void print1() {
//        synchronized (obj) {
//            for (int i = 0; i < 3; i++) {
//                try {
//                    long sleep = (long) (Math.random() * 100);
//                    Thread.sleep(sleep);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.print(i);
//            }
//        }
//    }
//
//    public synchronized static void print2() {
//        for (int i =3; i < 6; i++) {
//            try {
//                long sleep = (long) (Math.random() * 100);
//                Thread.sleep(sleep);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print(i);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        new Thread(() -> {
//            Printer.print1();
//        }).start();
//
//        new Thread(() -> {
//            Printer.print2();
//        }).start();
//    }
//}

