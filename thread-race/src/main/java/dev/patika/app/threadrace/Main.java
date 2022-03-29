package dev.patika.app.threadrace;

import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> oddNumbers = new ArrayList<>();
    static ArrayList<Integer> evenNumbers = new ArrayList<>();

    public static void main(String[] args) {
        //Main arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // Separate into 4 pieces
        ArrayList<Integer> q1 = new ArrayList<>(numbers.subList(0, 2500));
        ArrayList<Integer> q2 = new ArrayList<>(numbers.subList(2500, 5000));
        ArrayList<Integer> q3 = new ArrayList<>(numbers.subList(5000, 7500));
        ArrayList<Integer> q4 = new ArrayList<>(numbers.subList(7500, 10000));


        SomeRunnable runnable1 = new SomeRunnable(q1, oddNumbers, evenNumbers);
        SomeRunnable runnable2 = new SomeRunnable(q2, oddNumbers, evenNumbers);
        SomeRunnable runnable3 = new SomeRunnable(q3, oddNumbers, evenNumbers);
        SomeRunnable runnable4 = new SomeRunnable(q4, oddNumbers, evenNumbers);

        Thread simpleThread1 = new Thread(runnable1);
        Thread simpleThread2 = new Thread(runnable2);
        Thread simpleThread3 = new Thread(runnable3);
        Thread simpleThread4 = new Thread(runnable4);

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();
        simpleThread4.start();

        System.out.println(oddNumbers.size());
        System.out.println(evenNumbers.size());
    }
}
