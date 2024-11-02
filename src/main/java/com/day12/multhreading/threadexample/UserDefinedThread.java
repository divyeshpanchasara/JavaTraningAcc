package com.day12.multhreading.threadexample;

public class UserDefinedThread extends Thread{
    int tId;

    UserDefinedThread(int tId){
        this.tId = tId;
    }

    @Override
    public void run() throws RuntimeException{
        for (int i = 0; i < 5; i++) {
//            if(this.tId == 3) throw new RuntimeException();
            System.out.println("printing : " + (i + 1) + " by thread id: " + this.tId);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
