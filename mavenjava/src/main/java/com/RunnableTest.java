package com;

public class RunnableTest implements Runnable {
    private String threadName;
    private Thread t;

    public RunnableTest(String threadName) {
        this.threadName = threadName;
        System.out.println("creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try{
            for (int i = 0; i <4 ; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread " +  threadName + " exiting.");

    }

    //启动线程，进入就绪状态,因为Runnable没有start方法，所以方法体实际使用Tread对象的start方法
    public void start() {
        System.out.println("启动线程 " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
