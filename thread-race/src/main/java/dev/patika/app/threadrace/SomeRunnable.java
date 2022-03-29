package dev.patika.app.threadrace;

import java.util.ArrayList;


public class SomeRunnable implements Runnable {

    private ArrayList<Integer> givenList;
    private ArrayList<Integer> oddList;
    private ArrayList<Integer> evenList;


    public SomeRunnable(ArrayList givenList, ArrayList<Integer> oddList, ArrayList<Integer> evenList) {
        this.givenList = givenList;
        this.oddList = oddList;
        this.evenList = evenList;
    }

    @Override
    public void run() {
        for (Integer i : givenList) {
            if (i % 2 != 0) {
                oddList.add(i);
            } else {
                evenList.add(i);
            }
        }
    }
}
