package com.example.springPractice1;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lid;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    private String brand;

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void compiler(){
        System.out.println("Compiling............");
    }
}
