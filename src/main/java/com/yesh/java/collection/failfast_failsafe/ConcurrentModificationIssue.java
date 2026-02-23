package com.yesh.java.collection.failfast_failsafe;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationIssue extends Thread{

    static ArrayList<String> list = new ArrayList<>();

    public void run(){
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Child Thread updating list...");
        list.add("D");
    }


    public static void main(String[] args) throws InterruptedException {

        list.add("A");
        list.add("B");
        list.add("C");

        ConcurrentModificationIssue thread = new ConcurrentModificationIssue();
        thread.start();

        Iterator itr = list.iterator();

        while(itr.hasNext()){

            String str = (String) itr.next();
            System.out.println("Main Thread Iterating values: "+str);
            Thread.sleep(2000);
        }

        System.out.println(list);


    }
}
