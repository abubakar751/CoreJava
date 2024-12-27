package com.multithreading;

public class MultiThreadClass implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Pre Hello");
            Thread.sleep(2000);
        System.out.println("Hello");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MultiThreadClass th = new MultiThreadClass();
        Thread thread = new Thread(th);
        Thread thread2 = new Thread(th);
        thread.start();
        thread2.start();
    }

}
