package com.yesh.java.collection.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListWithThread  extends Thread{


    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public void run(){

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("Exception: "+e);
        }

        System.out.println("Adding list in child thread updating list");
        list.add("C");
    }
    public static void main(String[] args) throws InterruptedException {

        list.add("A");
        list.add("B");

        CopyOnWriteArrayListWithThread thread = new CopyOnWriteArrayListWithThread();
        thread.start();

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String s1 = (String)itr.next();
            System.out.println("Adding element using main thread");
            Thread.sleep(2000);
        }

        System.out.println(list);
    }
}
