package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.dto.Register;
import com.xworkz.enumeration.internal.Gender;

public class RegisterRunner {

    public static void main(String[] args) {


        Register register=new Register("hareesh",24, Gender.MALE,Gender.FEMALE.getLimit());


        System.out.println(Gender.MALE);
        System.out.println(register.getLimit());
        System.out.println(register);
    }
}
