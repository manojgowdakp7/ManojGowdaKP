package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.internal.Brand;

public class Laptop {

    private Brand brand;

    private int price;

    private  String type;

    private  int limit;


    public Laptop(Brand brand, int price, String type, int limit){
        this.brand=brand;
        this.price=price;
        this.type=type;
        this.limit=limit;
    }
    @Override
    public String toString(){
        return "Laptop["+ "Brand="+brand+
                ",Price="+price+
                ",LaptopType="+type+",Limit Is="+limit+"]";


    }

    public void setPrice (Brand brand){
        this.brand=brand;
    }
    public Brand getBrand(){
        return brand;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType()
    {
        return type;
    }



}
