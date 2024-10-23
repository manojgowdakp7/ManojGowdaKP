package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.dto.Laptop;
import com.xworkz.enumeration.internal.Brand;

public class Runner {
    public static void main(String[] args){
        Laptop laptop=new Laptop(Brand.SAMSUNG,50000,"gaming",Brand.SAMSUNG.getLimit());
        System.out.println(laptop.getType());
        System.out.println(laptop.getPrice());
        System.out.println(laptop.getBrand());
        System.out.println(laptop);


    }
}
