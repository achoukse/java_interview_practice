public class test2 {
    //how does thread deadlock
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->{
            synchronized (resource1) {
                System.out.println("Thread1 :holding resource1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread1 :waaiting for resoure 2");
                synchronized (resource2) {
                    System.out.println("Thread 1:acuried resouce 2");
                }
            }
        });

        Thread thread2 = new Thread(()->{

            synchronized ( resource2){
                System.out.println("Thread2 Holding resource 2");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){}
                System.out.println("Thread2 :waiting for resouce 1");
                synchronized (resource1){
                    System.out.println("Thread 2 Acuried resurce 1");
                }
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finished execution");

    }
}
