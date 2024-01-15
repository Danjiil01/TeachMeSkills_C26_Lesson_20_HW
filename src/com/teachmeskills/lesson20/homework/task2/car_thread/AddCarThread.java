package com.teachmeskills.lesson20.homework.task2.car_thread;

import com.teachmeskills.lesson20.homework.task2.service.CarService;

public class AddCarThread extends Thread{
    private CarService carService;

    public AddCarThread(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void run() {
        try {
            carService.addCar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
