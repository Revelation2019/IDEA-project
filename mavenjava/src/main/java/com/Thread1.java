package com;

public class Thread1 extends Thread {
    private String threadName;

    public Thread1(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("running " + threadName);
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread: " + threadName + "," + i);
                Thread.sleep(50);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("现成结束");
    }
}
