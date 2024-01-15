package com.teachmeskills.lesson20.homework.task1_2;

import com.teachmeskills.lesson20.homework.task1_2.activities.MorningActivities;

import java.io.FileInputStream;
import java.util.Properties;

public class Runner {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("D:\\Java\\TeachMeSkills_C26_Lesson_20_HW\\src\\com\\teachmeskills\\lesson20\\homework\\task1_2\\config\\config.properties"));
            String[] activities = {"Reading news", "Breakfast", "Making coffee"};
            for (int i = 0; i < 3; i++) {
                String activity = activities[i];
                int priority = Integer.parseInt(prop.getProperty("priority_" + (i + 1)));
                MorningActivities t = new MorningActivities(activity, priority);
                t.setName("Stream " + (i + 1));
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
