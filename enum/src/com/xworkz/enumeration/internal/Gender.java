package com.xworkz.enumeration.internal;

public enum Gender {

    MALE(30),FEMALE(25);

    private int limit;

    Gender(int limit) {
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }


}