package com.multithreading;
class MultithreadedTest extends Thread{
    private String name;
    public MultithreadedTest(String name){
        this.name=name;
    }
    public void run(){
        try {
            System.out.println("Start "+name);
            Thread.sleep(4000);
            System.out.println("completed "+name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
public class MultithreadingTest {
    public static void main(String[] args) {

            MultithreadedTest multiThreaded1 = new MultithreadedTest("AbuBakar");
        MultithreadedTest multiThreaded2 = new MultithreadedTest("AbuBakar");
        MultithreadedTest multiThreaded3 = new MultithreadedTest("AbuBakar");
        MultithreadedTest multiThreaded4 = new MultithreadedTest("AbuBakar");
        multiThreaded1.start();
        multiThreaded2.start();
        multiThreaded3.start();
        multiThreaded4.start();

    }
}
