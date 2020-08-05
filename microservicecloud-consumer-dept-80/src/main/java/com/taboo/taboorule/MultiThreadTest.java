package com.taboo.taboorule;

public class MultiThreadTest implements Runnable {
    //共享资源(临界资源)
    static int i=0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i++;
    }
    @Override
    public void run() {
        for(int j=0;j<10;j++){
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MultiThreadTest instance=new MultiThreadTest();
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        System.out.println(System.currentTimeMillis());
        t1.join();
        System.out.println(System.currentTimeMillis());
        t2.join();
        System.out.println(System.currentTimeMillis());
        System.out.println(i);
    }
}
