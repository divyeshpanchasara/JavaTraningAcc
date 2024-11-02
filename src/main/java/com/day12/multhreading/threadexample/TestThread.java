package com.day12.multhreading.threadexample;

/*
Signature for UserDefinedThread
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + " running in thread : " + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
*/
public class TestThread {
    public static void main(String[] args) {

        //initialization of new threads
        UserDefinedThread[] threads = new UserDefinedThread[5];
        for(int i = 0; i < 5; i++){
            threads[i] = new UserDefinedThread(i + 1);
        }

        // invoking start() for each thread
        for(int i = 0; i < 5; i++){
            try {
                threads[i].start();
            }catch (RuntimeException e){
                e.getMessage();
            }
        }
    }
}
