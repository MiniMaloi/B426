package com.joysistvi.day20.encapsulation.activity13_Sison;

public class UserAccounts {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean setEmail(String email) {
        if (email.contains("@") && email.contains(".") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Invalid email! Try again. ");
            return false;
        }
    }

    public boolean setPassword(String password) {
        if (password.length() >= 8 && !password.contains(" ")) {
            this.password = password;
            return true;
        } else {
            System.out.println("Invalid Password!, Try Again");
            return false;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
