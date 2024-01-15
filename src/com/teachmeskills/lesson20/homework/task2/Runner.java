package com.teachmeskills.lesson20.homework.task2;

import com.teachmeskills.lesson20.homework.task2.service.CarService;
import com.teachmeskills.lesson20.homework.task2.car_thread.AddCarThread;
import com.teachmeskills.lesson20.homework.task2.car_thread.RemoveCarThread;

public class Runner {
    public static void main(String[] args) {
        CarService carService = new CarService();

        for (int i = 0; i < 5; i++) {
            new AddCarThread(carService).start(); // создаем и запускаем потоки для добавления машин
            new RemoveCarThread(carService).start(); // создаем и запускаем потоки для забора машин
        }
    }
}
