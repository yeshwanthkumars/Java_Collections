package com.yesh.java.collection.concurrentcollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapWithThread extends Thread {

    static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

    public void run(){

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("Exception :"+e);
        }

        System.out.println("updating value in map using another thred "+Thread.currentThread().getName());
        map.put(104,"Yeshwanth");
    }

    public static void main(String[] args) throws InterruptedException {

        map.put(1,"Vishal");
        map.put(2,"Gokul");

        ConcurrentHashMapWithThread thread = new ConcurrentHashMapWithThread();
        thread.start();

        System.out.println("Running Main thread "+currentThread().getName());
        Set<Integer> key = map.keySet();
        Iterator<Integer> itr = key.iterator();

        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.println("Main Thread iterating map "+i+" "+currentThread().getName());
            Thread.sleep(2000);

        }

        System.out.println("Final Map  "+map);

    }
}
