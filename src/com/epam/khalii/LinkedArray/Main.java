package com.epam.khalii.LinkedArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static LinkedList<Double> llist = new LinkedList();
    public static ArrayList<Double> alist = new ArrayList<>();

    public static void initLists(){
        Random r = new Random();
        for (int i=0;i<100;i++) {
            llist.add(r.nextDouble());
            alist.add(r.nextDouble());
        }
    }

    public static void addToBegin(){
        Random r = new Random();
        long start, end, sum=0;


        System.out.println("Add to begin: linked list");
        for(int i=0; i<100;i++){
            start = System.nanoTime();
            llist.addFirst(r.nextDouble());
            end = System.nanoTime();
            sum+=end-start;
        }
        System.out.println(sum/100);

        sum=0;
        System.out.println("Add to begin: array list");
        for(int i=0; i<100;i++){
            start = System.nanoTime();
            alist.add(0, r.nextDouble());
            end = System.nanoTime();
            sum+=end-start;
        }
        System.out.println(sum/100);
    }

    public static void addToEnd(){
        Random r = new Random();
        long start, end, sum=0;

        System.out.println("Add to end: linked list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        llist.addLast(r.nextDouble());
        end = System.nanoTime();
        sum+=end-start;
        }
        System.out.println(sum/100);
        sum=0;

        System.out.println("Add to end: array list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        alist.add(r.nextDouble());
        end = System.nanoTime();
        sum+=end-start;
        }
        System.out.println(sum/100);
    }

    public static void addToMiddle(){
        Random r = new Random();
        long start, end, sum=0;

        System.out.println("Add to middle: linked list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        llist.add(llist.size() / 2, r.nextDouble());
        end = System.nanoTime();
        sum+=end-start;
        }
        System.out.println(sum/100);
        sum=0;

        System.out.println("Add to middle: array list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        alist.add(alist.size() / 2, r.nextDouble());
        end = System.nanoTime();
        sum+=end-start;}
        System.out.println(sum/100);
    }

    public static void delFromBegin(){
        long start, end, sum=0;

        System.out.println("Delete from begin: linked list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        llist.remove(0);
        end = System.nanoTime();
        sum+=end-start;
        }
        System.out.println(sum / 100);
        sum=0;

        System.out.println("Delete from begin: array list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        alist.remove(0);
        end = System.nanoTime();
        sum+=end-start;}
        System.out.println(sum/100);
    }

    public static void delFromEnd(){
        long start, end, sum=0;

        System.out.println("Delete from end: linked list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        llist.remove(llist.size() - 1);
        end = System.nanoTime();
        sum+=end-start;}
        System.out.println(sum/100);
        sum=0;

        System.out.println("Delete from end: array list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        alist.remove(alist.size() - 1);
        end = System.nanoTime();
        sum+=end-start;}
        System.out.println(sum/100);
    }

    public static void delFromMiddle(){
        long start, end, sum=0;

        System.out.println("Delete from middle: linked list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        llist.remove(llist.size() / 2);
        end = System.nanoTime();
        sum+=end-start;}
        System.out.println(sum/100);

        sum=0;
        System.out.println("Delete from middle: array list");
        for(int i=0; i<100;i++){
        start = System.nanoTime();
        alist.remove(alist.size()/2);
        end = System.nanoTime();
        sum+=end-start;}
        System.out.println(sum/100);
    }


    public static void main(String[] args) {
        initLists();
        addToBegin();
        addToMiddle();
        addToEnd();
        delFromBegin();
        delFromMiddle();
        delFromEnd();
    }
}
