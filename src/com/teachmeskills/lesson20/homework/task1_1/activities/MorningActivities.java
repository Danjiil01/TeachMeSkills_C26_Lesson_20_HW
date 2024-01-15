package com.teachmeskills.lesson20.homework.task1_1.activities;

public class MorningActivities implements Runnable{
    private String activityName;
    private int priority;

    public MorningActivities(String activityName, int priority) {
        this.activityName = activityName;
        this.priority = priority;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        System.out.println("Running " + activityName + ". Stream " + Thread.currentThread().getName());
    }
}
