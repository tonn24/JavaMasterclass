package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return getAge() > 12 && getAge() < 20;
    }

    public String getFullName() {
        if(getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        } else if(lastName.isEmpty() && !firstName.isEmpty()) {
            return firstName;
        } else if(!lastName.isEmpty() && firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
