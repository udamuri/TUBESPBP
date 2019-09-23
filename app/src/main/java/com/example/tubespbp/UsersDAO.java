package com.example.tubespbp;

public class UsersDAO {
    String username, email, password, gender, phone;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UsersDAO(String username, String email, String password, String gender, String phone) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }
}
