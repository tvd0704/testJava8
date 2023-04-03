package oca;

class A {
    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining("1");
        ThreadJoining t2 = new ThreadJoining("2");
        ThreadJoining t3 = new ThreadJoining("3");
// thread t1 starts
        t1.start();
// starts second thread after when
// first thread t1 has died.
        try {
            t1.join();
        } catch (Exception ex) {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }
// t2 starts
        t2.start();
// starts t3 after when thread t2 has died.
        try {
            t2.join();
        } catch (Exception ex) {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }
        t3.start();
    }

    public static class ThreadJoining extends Thread {
        private String id;

        public ThreadJoining(String id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Start Thread: " + this.id);
            for (int i = 0; i < 2; i++) {
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                    System.out.println("Exception has" +
                            " been caught" + ex);
                }
            }
            System.out.println("Finish Thread: " + this.id);
        }
    }

}

