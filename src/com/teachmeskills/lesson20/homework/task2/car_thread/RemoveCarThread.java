package com.teachmeskills.lesson20.homework.task2.car_thread;

import com.teachmeskills.lesson20.homework.task2.service.CarService;

public class RemoveCarThread extends Thread{
    private CarService carService;

    public RemoveCarThread(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void run() {
        try {
            carService.removeCar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
