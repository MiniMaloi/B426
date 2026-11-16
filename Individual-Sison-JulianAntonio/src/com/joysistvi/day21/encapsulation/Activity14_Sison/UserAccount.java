package com.joysistvi.day21.encapsulation.Activity14_Sison;

public class UserAccount {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount(
            String firstName,
            String middleName,
            String lastName,
            String address,
            String email,
            String password) {
        SetFirstName(firstName);
        SetMiddleName(middleName);
        SetLastName(lastName);
        SetAddress(address);
        SetEmail(email);
        SetPassword(password);
    }

    public String GetFirstName() {
        return firstName;
    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String GetMiddleName() {
        return middleName;
    }

    public void SetMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String GetLastName() {
        return lastName;
    }

    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }

    public String GetAddress() {
        return address;
    }

    public void SetAddress(String address) {
        this.address = address;
    }

    public String GetEmail() {
        return email;
    }

    public void SetEmail(String email) {
        if (!email.isEmpty()) {
            System.out.println("Invalid email format.");
        }
        if (email.contains("@") && email.contains(".") && !email.contains(" ")){
            this.email = email;}
    }

    public String GetPassword() {
        return password;
    }

    public void SetPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Invalid Password!, Try Again");
        }

        if (password.contains(" ")){
            System.out.println("Your password contains a whitespace");
        }

        this.password = password;
    }


    @Override
    public String toString() {
        return "Full Name: " + firstName + " " + middleName + " " + lastName
                + "\nEmail: " + email
                + "\nAddress: " + address;
    }
}

