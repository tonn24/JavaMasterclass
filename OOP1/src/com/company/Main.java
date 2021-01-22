package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        testCalculator();
//
//        testPeronClass();
//
//        testBankAccount();
//
//        testVipCustomer();



    }

    public static void testCalculator() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Sub = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());
    }

    public static void testPeronClass() {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);
        System.out.println(person.getAge());
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setLastName("West");
        person.setAge(18);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    }

    public static void testBankAccount() {
        BankAccount b1 = new BankAccount("EE2315134631234", 100, "Tony", "tony@gmail.com", "2352625467245");
        b1.withdrawFunds(150);
        b1.withdrawFunds(90);
        b1.depositFunds(200);
        System.out.println(b1.getCustomerName());
        System.out.println(b1.getBalance());
        System.out.println(b1.getEmail());
        System.out.println(b1.getNumber());
    }

    public static void testVipCustomer() {
        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getName() + " " + vip.getEmail() + " " + vip.getCreditLimit());

        VipCustomer vip2 = new VipCustomer("Martin", 1500, "martin@gmail.com");
        System.out.println(vip2.getName() + " " + vip2.getEmail() + " " + vip2.getCreditLimit());
    }
}
