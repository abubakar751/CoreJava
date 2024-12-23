package com.multithreading;
class MultiThreaded extends Thread {
    public void run(){
        System.out.println("Thread "+Thread.currentThread().getId()+" Is Running");
    }

}
public class MultithreadingDemo {
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i <n ; i++) {
            MultiThreaded multiThreaded = new MultiThreaded();
            multiThreaded.start();
        }
    }

}
