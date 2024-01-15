package com.teachmeskills.lesson20.homework.task2.service;

import com.teachmeskills.lesson20.homework.task2.constant.IConstants;

public class CarService {
    private int maxCapacity = IConstants.MAX_CAPACITY;
    private int carsInService = 0;

    public synchronized void addCar() throws InterruptedException {
        while (carsInService >= maxCapacity) {
            wait(); // ожидаем, пока освободится место для новой машины
        }
        carsInService++;
        System.out.println("Car added to Technical service. Cars under maintenance: " + carsInService);
        notifyAll(); // сообщаем другим потокам, что появилась свободная машина
    }

    public synchronized void removeCar() throws InterruptedException {
        while (carsInService <= 0) {
            wait(); // ожидаем, пока появится машина для забора
        }
        carsInService--;
        System.out.println("Car removed to Technical service. Cars under maintenance: " + carsInService);
        notifyAll(); // сообщаем другим потокам, что место освободилось
    }
}
