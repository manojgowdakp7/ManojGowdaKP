package com.xworkz.enumeration.internal;

public enum Brand {

    DELL(20000),LENOVO(30000),HP(60000),SAMSUNG(80000);

    public int limit;

    Brand(int limit) {
        this.limit = limit;
    }
    public void setLimit(int limit){
        this.limit=limit;
    }
    public int getLimit(){
        return limit;
    }

}
