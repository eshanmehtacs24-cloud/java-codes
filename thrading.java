class College implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Department implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new College());
        Thread t2 = new Thread(new Department());

        t1.start();
        t2.start();
    }
}
