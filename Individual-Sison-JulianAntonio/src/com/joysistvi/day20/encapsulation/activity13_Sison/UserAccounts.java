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
    // UserAccounts.firstname = setFirstName("Van")

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
        if (email.isEmpty()) return false;
        if (email.contains("@") && email.contains(".") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Invalid email! Try again. ");
            return false;
        }
    }

    public boolean setPassword(String password) {



        if (password.length() < 8) {
            System.out.println("Invalid Password!, Try Again");
            return false;
        }

        if (password.contains(" ")){
            System.out.println("Your password contains a whitespace");
            return false;
        }

        this.password = password;
        return true;
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
