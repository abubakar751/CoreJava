package com.multithreading;
class  Multithreaded implements Runnable{
    public void run(){
        System.out.println("thread "+Thread.currentThread().getId()+" Is running");
    }
}
public class MultithreadingDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i <8 ; i++) {
            Thread multithreaded = new Thread(new  Multithreaded());
            multithreaded.start();
        }

    }
}

