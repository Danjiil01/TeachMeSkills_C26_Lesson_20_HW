package com.teachmeskills.lesson20.homework.task1_1;

import com.teachmeskills.lesson20.homework.task1_1.activities.MorningActivities;

import java.io.FileInputStream;
import java.util.Properties;

public class Runner {
        public static void main(String[] args) {
            Properties prop = new Properties();
            try {
                prop.load(new FileInputStream("D:\\Java\\TeachMeSkills_C26_Lesson_20_HW\\src\\com\\teachmeskills\\lesson20\\homework\\task1_1\\config\\config.properties"));
                String[] activities = {"Reading news", "Breakfast", "Making coffee"};
                for (int i = 0; i < 3; i++) {
                    String activity = activities[i];
                    int priority = Integer.parseInt(prop.getProperty("priority_" + (i + 1)));
                    Thread t = new Thread(new MorningActivities(activity, priority), "Stream " + (i + 1));
                    t.start();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
