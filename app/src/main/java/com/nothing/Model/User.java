package com.nothing.Model;

public class User {
    private String uId, name, profile, city;

    public User(){

    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User(String uId, String name, String profile, String city) {
        this.uId = uId;
        this.name = name;
        this.profile = profile;
        this.city = city;
    }
}
